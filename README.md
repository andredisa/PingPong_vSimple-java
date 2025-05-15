# 🏓 Ping Pong Game 🎮

> Welcome to the **ultimate Ping Pong game** built in Java! Get ready for fast-paced, addictive gameplay with smooth controls and exciting sound effects! 🎉

---

## 🚀 About the Game

This classic Ping Pong game brings the retro arcade feel straight to your desktop!  
Control your racket 🏓, bounce the ball 🎾, and compete against a friend or the CPU 🤖.  
The game speeds up as you play, making every rally more thrilling! ⚡

---

## 🎯 Features

- **Smooth and responsive controls**  
  Player 1: `W` (up) / `S` (down)  
  Player 2: `UP` / `DOWN` arrow keys

- **CPU Mode** 🧠  
  Press `C` to enable CPU opponent for single-player fun!

- **Dynamic ball speed** ⚡  
  Ball velocity increases with every racket hit, testing your reflexes!

- **Sound effects** 🔊  
  Bounce and score sounds enhance the immersive experience!

- **Clean and simple UI**  
  Minimalist design focused on gameplay, with scores displayed on the rackets.

- **Game Over & Restart**  
  First to 5 points wins! Press `R` to restart anytime.

---

## 🎮 How to Play

1. Launch the game by running `Main.java`  
2. Press **ENTER** to start from the menu  
3. Use your controls to move your racket up and down  
4. Bounce the ball past your opponent’s racket to score!  
5. First player to reach 5 points wins the match 🏆  
6. Press **R** to restart after the game ends  
7. Toggle CPU mode anytime by pressing **C**

---

## 📖 How it Works

- The **Ball** class manages position, movement, and speed increase.  
- The **Racket** class handles player or CPU paddle movement and scoring.  
- The main game loop uses a `Timer` for smooth animations and updates.  
- Key listeners track continuous paddle movement for fluid control.  
- Sound playback is threaded to prevent lag and keep gameplay buttery smooth.

---

## 🛠️Setup
Ready to jump into the action? Just follow these easy steps! 👇

1. **Clone the repository**  
Open your terminal and type:  
```bash
git clone https://github.com/andredisa/PingPong_vSimple-java.git
```

2. **Navigate to the project folder**
```bash
cd PingPong_vSimple-java/src
```
3. **Compile the source code**
> Make sure you have Java installed, then run:
```bash
javac *.java
```

4. **Run the game**
>Launch the game with:
```bash
java Main
```

5. **Start playing!**
>Press ENTER to start, and enjoy your Ping Pong battle! 🏓🔥

---

## 📂 Project Structure
```plaintext
PingPong_vSimple-java/
├── src/                    # 💻 Source code files
│   ├── Main.java           # 🎮 Main game loop and rendering
│   ├── Ball.java           # 🎾 Ball logic and movement
│   ├── Racket.java         # 🏓 Player and CPU paddles
│   └── SoundPlayer.java    # 🔊 Sound effects handler
├── sounds/                 # 🎵 Audio files for game effects
│   ├── bounce.wav          # 🔔 Bounce sound effect
│   └── score.wav           # 🥳 Score sound effect
|
├── README.md               # 📖 Project documentation and instructions
└── LICENSE                 # 📜 License information

```

---

## 🎉 Try it Out!

Feel free to **fork** or **clone** this repo and start smashing that ball around!  
Perfect for learning Java GUI programming and having fun! 😄

---

## 📣 Feedback & Contributions

Suggestions, improvements, or just want to chat about Pong?  
Open an issue or drop a message! We love community ❤️

---

## 📝 License

This project is open-source and free to use. Enjoy! 🚀

---

Made with ❤️ by [andredisa]

---

### LET’S PING, LET’S PONG! 🏓🔥