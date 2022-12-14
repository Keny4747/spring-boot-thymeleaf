package com.app.di;

import java.util.Arrays;
import java.util.List;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.app.di.domain.ItemFactura;
import com.app.di.domain.Producto;
import com.app.di.service.IServicio;
import com.app.di.service.MiServicio;
import com.app.di.service.MiServicioComplejo;

@Configuration
public class AppConfig {
	
	@Bean("miServicioSimple")
	public IServicio registrarMiServicio() {
		return new MiServicio();
	}
	
	@Bean("miServicioComplejo")
	public IServicio registrarMiServicioComplejo() {
		return new MiServicioComplejo();
	}
	
	@Bean("itemsFactura")
	public List<ItemFactura> registrarItems(){
		Producto producto1 = new Producto("Camara Sony",323.2);
		Producto producto2 = new Producto("Impresora Brother",679.2);
		
		ItemFactura linea1 = new ItemFactura(producto1,3);
		ItemFactura linea2 = new ItemFactura(producto2,10);
		
		return Arrays.asList(linea1, linea2);
	}
	
	@Bean("itemsFacturaOficina")
	public List<ItemFactura> registrarItemsOficina(){
		Producto producto1 = new Producto("Monitor LG", 250.3);
		Producto producto2 = new Producto("Monitor ASUS",100.2);
		Producto producto3 = new Producto("Escritorio Oficina",400.2);
		
		ItemFactura linea1 = new ItemFactura(producto1,3);
		ItemFactura linea2 = new ItemFactura(producto2,10);
		ItemFactura linea3 = new ItemFactura(producto3,5);
		
		return Arrays.asList(linea1, linea2, linea3);
	}
}
