"use strict";

const URL = `https://testimonialapi.vercel.app/api/1`;



const testimony = async () => {

  const response = await fetch(URL);

  const testimonyData = await response.json();

  console.log(testimonyData);

  displayTestimony(testimonyData);

};