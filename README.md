# Splash X6 - A FOSS desktop civilisation game.

![Screen Shot 2022-02-17 at 10 27 13 pm](https://user-images.githubusercontent.com/50697488/154581520-308c3a30-5396-47d1-88b9-fbbc3b303e44.png)


## What is this
X6 is a work-in-progress turn based 4X settlement strategy game heavily inspired by early editions of Civilisation and it's remakes, Anno, OpenTTD, and more.

The foundation of this project started around 2017, where I started to learn how to hack together game prototypes in various languages. Through five itterations, the series has resulted in X6.

This particular installation was developed as a university driven development project, forming my final dissertation project, landing my into the world of development.

## Any good?
Depends on who you ask.

With several thousand lines of code, and more hours of time poured into this project than i'd like to admit, the engine foundation is well developed.

As for gameplay features, the game can be concidered early. The current prototype contains many demonstratory features; enough to get started with a game, but not enough to keep you playing.

### Features

- Share a world between clients over the network.
- Pathfinding
- World generation system
- Spotify API intergration
- Custom state machine implementation
- Save / load a world disk
- Create settlements
- Create units

#### State machine scripture
An aside to this project is `sms`, a simple ANTLR language which is an internal tool for developing state machines.

X6 contains a custom state machine implementation, but I found the boilerplate and api formatting tedious for implementing a state machine by hand, so I wrote simplified scripting format and compiler which translates it to Java using `JavaPoet`, implementing the machine.

## What's planned

## Contribution
Closed, for now. This project is moderated for my studies, and is excluding external contribution.

Expect the project to become FOSS and accepting of contribution around the end of this year.
