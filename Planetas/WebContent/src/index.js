let size = 8;

const container = document.querySelector(".container");

for (let i = 0; i < size; i++) {
  let element = document.createElement("div");
  element.classList.add("item");
  container.appendChild(element);
}
