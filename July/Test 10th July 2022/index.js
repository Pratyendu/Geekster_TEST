const p1 = document.getElementById("p1");
const p2 = document.getElementById("p2");
const p3 = document.getElementById("p3");
const p4 = document.getElementById("p4");
const img = document.getElementById("img");

const fetchDetails = async () => {
  const url = `https://jsonplaceholder.typicode.com/users`;
  const response = await fetch(url);
  const data = await response.json();
  console.log(data);

  p1.innerHTML = data[0].name;
  p2.innerHTML = data[0].email;
  p3.innerHTML = data[0].address.city;
  p4.innerHTML = data[0].website;

  img.src =
    "https://media-exp1.licdn.com/dms/image/C5603AQEoEsr-aec4rA/profile-displayphoto-shrink_200_200/0/1649814610733?e=1660176000&v=beta&t=CLsmp1sBOx7R9WD9BUDaFDBne0YNrWUdnH7-hTiRxX4";
};
