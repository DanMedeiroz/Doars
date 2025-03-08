import { ApplicationConfig, provideZoneChangeDetection } from '@angular/core';
import { provideRouter } from '@angular/router';
import { routes } from './app.routes';
import { provideHttpClient } from '@angular/common/http'; // Exemplo de configuração de HTTP

export const appConfig: ApplicationConfig = {
  providers: [
    provideZoneChangeDetection({ eventCoalescing: true }), // Configuração do Zone.js
    provideRouter(routes), // Configuração do roteador
    provideHttpClient() // Exemplo: Configuração do HttpClient
  ]
};