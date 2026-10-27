import { useState } from "react";

const colors = [
  { name: "Red", value: "red" },
  { name: "Blue", value: "blue" },
  { name: "Green", value: "green" },
  { name: "Yellow", value: "yellow" },
];

export default function App() {
  const [color, setColor] = useState("white");

  return (
    <main className="app" style={{ backgroundColor: color }}>
      <h1>Select a Color</h1>
      <div className="buttons">
        {colors.map((item) => (
          <button
            key={item.name}
            type="button"
            onClick={() => setColor(item.value)}
            style={{ backgroundColor: item.value, color: item.name === "Yellow" ? "black" : "white" }}
          >
            {item.name}
          </button>
        ))}
      </div>
      <h2 aria-live="polite">
        {color === "white" ? "Please select a color." : `You have selected ${color[0].toUpperCase()}${color.slice(1)} color.`}
      </h2>
    </main>
  );
}
