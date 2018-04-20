package co.edu.usbcali.demo.modelo;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

class TestConfigXML {

	private final static Logger log=LoggerFactory.getLogger(TestConfigXML.class);
	
	@Test
	void test() {
		ApplicationContext app=new ClassPathXmlApplicationContext("appCon.xml");
		assertNotNull(app,"El app es Nulo");
		
		Vehiculo vehiculo=(Vehiculo)app.getBean(Vehiculo.class);
		assertNotNull(vehiculo,"El vehiculo es Nulo");
		
		log.info("Marca:"+vehiculo.getMarca());
		log.info("Color:"+vehiculo.getColor());
		log.info("Cilindraje:"+vehiculo.getMotor().getCilindraje());
	}

}
