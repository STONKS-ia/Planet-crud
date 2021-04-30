let size = 8;

const listContainer = document.querySelector(".listContainer");

for (let i = 0; i < size; i++) {
  const listItem = document.createElement("div");
  const icon = document.createElement("img");
  const name = document.createElement("p");
  const btnEdit = document.createElement("button")
  const btnDel = document.createElement("button");
  let random = Math.floor(Math.random() * 6) + 1;


  listItem.classList.add("listItem");

  icon.setAttribute("src", `src/img/planet-${random}.png`);
  icon.setAttribute("id", "icon");
  icon.setAttribute("alt", "icon");
  
  name.setAttribute("id", "name");
  name.innerText = "Name Planet";

  btnEdit.setAttribute("id", "edit");
  btnDel.setAttribute("id", "del");
  
  listItem.appendChild(icon);
  listItem.appendChild(name);
  listItem.appendChild(btnEdit);
  listItem.appendChild(btnDel);
  listContainer.appendChild(listItem);
}
