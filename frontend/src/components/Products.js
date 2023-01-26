import React, { useEffect, useState } from "react";
import { MeasurementsApi } from "../api/api";
import ProductsTable from "./ProductsTable";
import { Button } from "@mui/material";

const Products = () => {
  const [products, setProducts] = useState([]);
  const [loaded, setLoaded] = useState(false);
  const measurementsApi = new MeasurementsApi();

  const fetchData = () => {
    measurementsApi
      .getProducts()
      .then((result) => {
        setProducts(result.data);
        setLoaded(true);
      })
      .catch((response) => console.log(`error ${response}`));
  };
  useEffect(() => {
    fetchData();
  });

  return (
    <div style={{ padding: "25px" }}>
      <h2>Products</h2>
      <Button variant="contained">New Product</Button>
      <br />
      <br />
      {loaded ? <ProductsTable products={products} /> : "loading..."}
    </div>
  );
};

export default Products;
