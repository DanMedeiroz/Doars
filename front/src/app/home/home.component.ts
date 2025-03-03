import { Component } from '@angular/core';

@Component({
  selector: 'app-home',
  standalone: true,
  imports: [],
  templateUrl: './home.component.html',
  styleUrls: ['./home.component.css']
})
export class HomeComponent {
  isDropdownOpen = false;
  isMobileMenuOpen = false;

  toggleDropdown() {
    this.isDropdownOpen = !this.isDropdownOpen;
  }

  menuShow() {
    this.isMobileMenuOpen = !this.isMobileMenuOpen;
  }

  // Fechar o dropdown se o usuário clicar fora dele
  onWindowClick(event: MouseEvent) {
    if (!(event.target as HTMLElement).matches('.dropbtn')) {
      this.isDropdownOpen = false;
    }
  }

  constructor() {
    // Adiciona um listener para o evento de clique na janela
    window.addEventListener('click', this.onWindowClick.bind(this));
  }

  ngOnDestroy() {
    // Remove o listener quando o componente é destruído
    window.removeEventListener('click', this.onWindowClick.bind(this));
  }
}