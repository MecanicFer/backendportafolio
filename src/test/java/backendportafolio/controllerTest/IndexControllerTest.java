package backendportafolio.controllerTest;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import backendportafolio.controller.IndexController;

import org.apache.commons.logging.Log;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.*;

class IndexControllerTest {

    @Mock
    private Log log;

    @InjectMocks
    private IndexController indexController;

    @BeforeEach
    void setUp() {
        // Inicializar los mocks
        MockitoAnnotations.initMocks(this);
    }

    @Test
    void showindexShouldReturnIndexView() {
        // Arrange (Preparación)
        String expectedViewName = "index"; // Cambiar "index" por el nombre correcto de la vista

        // Act (Ejecución)
        String actualViewName = indexController.showindex();

        // Assert (Verificación)
        assertEquals(expectedViewName, actualViewName);
        verify(log).info("returning INDEX view");
    }
}

