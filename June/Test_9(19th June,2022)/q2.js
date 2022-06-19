let friends = [
  { fname: "Rachel ", lname: "Green", id: 1, marks: 98 },
  { fname: "Ross ", lname: "Geller", id: 2, marks: 23 },
  { fname: "Monica ", lname: "Geller", id: 3, marks: 75 },
  { fname: "Joey", lname: " Tribbiani", id: 4, marks: 46 },
  { fname: "Chandler  ", lname: "Bing", id: 5, marks: 78 },
  { fname: "Phoebe ", lname: "Buffay", id: 6, marks: 45 },
];

function printName() {
  for (i = 0; i < friends.length; i++) {
    let name = friends[i].fname + friends[i].lname;
    console.log("The fnames and lnames are", name);
  }
}
printName();
