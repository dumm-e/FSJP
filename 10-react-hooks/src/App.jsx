import { useState } from "react";

function App() {
    const [color, setColor] = useState("white");

    return (
        <div style={{
            backgroundColor: color,
            minHeight: "100vh",
            textAlign: "center",
            padding: "50px"
        }}>
            <h2>Select a Color</h2>

            <button onClick={() => setColor("red")}
                style={{ backgroundColor: "red", color: "white" }}>
                Red
            </button>

            <button onClick={() => setColor("blue")}
                style={{ backgroundColor: "blue", color: "white" }}>
                Blue
            </button>
          

            <button onClick={() => setColor("green")}
                style={{ backgroundColor: "green", color: "white" }}>
                Green
            </button>

            <button onClick={() => setColor("yellow")}
                style={{ backgroundColor: "yellow", color: "black" }}>
                Yellow
            </button>

            <h3>
                {color === "white"
                    ? "Please select a color."
                    : "You selected " + color}
            </h3>
        </div>
    );
}

export default App;
