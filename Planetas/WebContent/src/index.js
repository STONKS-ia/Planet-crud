let size = 8;

const listContainer = document.querySelector(".listContainer");
const listItems = document.querySelectorAll(".listItem");

listItems.forEach((listItem) => {
  listItem.addEventListener("click", () => {
    listItem.classList.toggle("active");
  });
});