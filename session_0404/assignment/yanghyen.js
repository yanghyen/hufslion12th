document.addEventListener("DOMContentLoaded", function() {
  const namiImage = document.getElementById('namiImage');
  const cuteButton = document.getElementById('cute');

  cuteButton.addEventListener('click', () => {
      namiImage.classList.add('rotate');

      setTimeout(() => {
          namiImage.classList.remove('rotate');
      }, 1000); 
  });
});
