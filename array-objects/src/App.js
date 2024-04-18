import React from 'react';
import TableView from './TableView';
import './index.css';
const App = () => {
  const data = [
    {ID:1,Name:'Hyndu',Age:20},
    {ID:2,Name:'Divya',Age:17},
    {ID:3,Name:'Ramya',Age:28},
    {ID:4,Name:'Shyam',Age:31},
    {ID:5,Name:'Karthik',Age:43},
    {ID:6,Name:'KBK',Age:10000},
    


  ];
  return (
    <div>
      <h1 style={{textAlign:'center',borderBottom:'2px solid blue',paddingTop:'20px',marginBottom:'100px'}}>
        Array of Objects - Table View
      </h1>
      <TableView data={data}/>
    </div>
  );
};


export default App;
