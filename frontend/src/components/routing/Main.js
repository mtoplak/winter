import React from "react";
import Measurements from "../Measurements";
import PageNotFound from "../PageNotFound";
import Products from "../Products";
import { Routes, Route, BrowserRouter } from "react-router-dom";

function Main() {
  return (
    <>
      <BrowserRouter>
        <Routes>
          <Route path="/" element={<Measurements />} />
          <Route path="/products" element={<Products />} />
          <Route path="*" element={<PageNotFound />} />
        </Routes>
      </BrowserRouter>
    </>
  );
}

export default Main;
