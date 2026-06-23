package com.andres.course.springai.apps.mcpserver.tools;

import org.springframework.ai.mcp.annotation.McpTool;
import org.springframework.stereotype.Component;

@Component
public class WeatherTools {

    @McpTool(description = "Obtiene la temperatura actual de una ciudad y el tiempo")
    public String getCurrentWeatherTemperature(String city) {

        return switch (city.toLowerCase()){
            case "santiago" -> "La temperatura actual de santiago es de 22 grados C";
            case "madrid" -> "La temperatura actual de madrid es de 16 grados C";
            case "buenos aires" -> "La temperatura actual de buenos aires es de 24 grados C";
            case "ciudad de mexico" -> "La temperatura actual de ciudad de mexico DF es de 32 grados C";
            default -> "No tengo datos de temperaturas para la ciudad: " + city;
        };
    }

    @McpTool(description = "Recomienda ropa segun el clima de una ciudad")
    public String getWeatherRecommendation(String city) {

        return switch (city.toLowerCase()) {
            case "santiago" -> "En Santigo puedes usar ropa ligera y una chaqueta delgada para la tarde.";
            case "madrid" -> "En Madrid conviene llevar u na chaqueta ligera durante el dia y en la tarde noche bien abrigado";
            case "buenos aires" -> "En Buenos Aires puedes usar ropa fresca y comoda.";
            case "ciudad de mexico" -> "En Ciudad de Mexico ser recomienda llevar polera manga corta, playera, remera o sudadera y short o pantalones cortos";
            default -> "No tengo recomendaciones del clima para la ciudad: " + city;
        };
    }
}
