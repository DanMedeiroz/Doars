import { Component, OnInit, Renderer2 } from '@angular/core';

@Component({
  selector: 'app-home',
  templateUrl: './home.component.html',
  styleUrls: ['./home.component.css']
})
export class HomeComponent implements OnInit {

  constructor(private renderer: Renderer2) { }

  ngOnInit(): void {
    this.initializeSlider();
  }

  initializeSlider(): void {
    const slider = document.querySelectorAll('.slider') as NodeListOf<HTMLElement>;
    const btnPrev = document.getElementById('prev-button');
    const btnNext = document.getElementById('next-button');

    let currentSlide = 0;

    const hideSlider = () => {
      slider.forEach(item => item.classList.remove('on'));
    };

    const showSlider = () => {
      if (slider.length > 0) {
        slider[currentSlide].classList.add('on');
      }
    };

    const nextSlider = () => {
      hideSlider();
      if (currentSlide === slider.length - 1) {
        currentSlide = 0;
      } else {
        currentSlide++;
      }
      showSlider();
    };

    const prevSlider = () => {
      hideSlider();
      if (currentSlide === 0) {
        currentSlide = slider.length - 1;
      } else {
        currentSlide--;
      }
      showSlider();
    };

    // Usando Renderer2 para garantir a manipulação do DOM dentro do Angular
    if (btnNext) {
      this.renderer.listen(btnNext, 'click', nextSlider);
    }

    if (btnPrev) {
      this.renderer.listen(btnPrev, 'click', prevSlider);
    }

    // Inicializa o slider ao carregar a página
    showSlider();
  }
}
