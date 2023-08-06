package backendportafolio.controllerTest;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.*;

import java.io.ByteArrayOutputStream;
import java.io.IOException;

import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServletResponse;

import org.junit.jupiter.api.Test;

import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;

import com.google.zxing.BarcodeFormat;
import com.google.zxing.WriterException;
import com.google.zxing.client.j2se.MatrixToImageWriter;
import com.google.zxing.common.BitMatrix;
import com.google.zxing.qrcode.QRCodeWriter;

import backendportafolio.controller.QRCodeController;



class QRCodeControllerTest {

    @Test
    void generateQRCode_ShouldReturnQRCodeImage() throws WriterException, IOException {
        // Arrange
        QRCodeController controller = new QRCodeController();
        String link = "https://www.example.com";
        HttpServletResponse response = mock(HttpServletResponse.class);
        ServletOutputStream outputStream = mock(ServletOutputStream.class);

        when(response.getOutputStream()).thenReturn(outputStream);

        // Act
        ResponseEntity<byte[]> responseEntity = controller.generateQRCode(link, response);

        // Assert
        byte[] pngData = responseEntity.getBody();
        ByteArrayOutputStream expectedOutputStream = new ByteArrayOutputStream();
        QRCodeWriter qrCodeWriter = new QRCodeWriter();
        BitMatrix bitMatrix = qrCodeWriter.encode(link, BarcodeFormat.QR_CODE, 350, 350);
        MatrixToImageWriter.writeToStream(bitMatrix, MediaType.IMAGE_PNG.getSubtype(), expectedOutputStream);
        byte[] expectedPngData = expectedOutputStream.toByteArray();

        assertEquals(expectedPngData.length, pngData.length);

        // You may add more assertions to compare the content of pngData and expectedPngData.
    }
}



