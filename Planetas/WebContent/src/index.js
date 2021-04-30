let size = 8;

const container = document.querySelector(".container");

for (let i = 0; i < size; i++) {
  let item = document.createElement("div");
  let img = document.createElement("img");
  let p = document.createElement("p");
  let buttonEdit = document.createElement("button");
  let buttonDelete = document.createElement("button");
  let random = Math.floor(Math.random() * 6)+1;
  
  item.classList.add("item");
  img.classList.add("icon");
  p.classList.add("name");
  p.innerText = "Planet Name";
  buttonEdit.classList.add("edit");
  buttonDelete.classList.add("delete");
  img.setAttribute("src", "src/img/planet-"+random+".png")
  
  item.appendChild(img);
  item.appendChild(p);
  item.appendChild(buttonEdit);
  item.appendChild(buttonDelete);
  container.appendChild(item);
}
