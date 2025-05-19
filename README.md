# 🏓 Ping Pong Game 🎮

> Welcome to the **ultimate Ping Pong game** built in Java! Get ready for fast-paced, addictive gameplay with smooth controls and exciting sound effects! 🎉

---

## 🚀 About the Game

This classic Ping Pong game brings the retro arcade feel straight to your desktop!  
Control your racket 🏓, bounce the ball 🎾, and compete against a friend or the CPU 🤖.  
The game speeds up as you play, making every rally more thrilling! ⚡

---

## ✨ Features

- 🕹️ **Smooth & responsive controls** — Player 1 uses `W`/`S`, Player 2 uses `⬆️`/`⬇️`.  
- 🤖 **CPU Mode** — Press `C` to challenge a smart AI opponent for solo matches.  
- ⚡ **Dynamic ball speed** — The ball accelerates with each paddle hit, pushing your reflexes to the limit!  
- 🔊 **Retro sound effects** — Classic bounce and score sounds bring that nostalgic arcade feeling.  
- 🌈 **Neon arcade-style UI** — Glowing center line, paddle-displayed scores, and a vibrant, retro look.  
- 🏁 **Game Over & Restart** — First to 5 points wins! Press `R` to restart anytime.


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

## ☕ Support Me

If you find my work useful and would like to support me, you can buy me a coffee! Your support helps me keep creating and improving my projects. Thank you! 😊

<a href="https://www.buymeacoffee.com/andredisa" target="_blank"><img src="https://cdn.buymeacoffee.com/buttons/v2/default-yellow.png" alt="Buy Me A Coffee" style="height: 60px !important;width: 217px !important;" ></a>

---

### LET’S PING, LET’S PONG! 🏓🔥
