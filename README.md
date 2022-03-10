# Splash X6 - A FOSS desktop civilisation game.

![Screen Shot 2022-02-17 at 10 27 13 pm](https://user-images.githubusercontent.com/50697488/154581520-308c3a30-5396-47d1-88b9-fbbc3b303e44.png)


## What is this
X6 is a work-in-progress turn based 4X settlement strategy game heavily inspired by early editions of Civilisation and it's remakes, Anno, OpenTTD, and more.

The foundation of this project started around 2017, where I started to learn how to hack together game prototypes in various languages. Through five itterations, the series has resulted in X6.

This particular installation was developed as a university driven development project, forming my final dissertation project, landing me ultimately into the world of development.

## So, s'it any good?
Depends on who you ask.

With over 14k lines of Kotlin contributed and more hours of time poured into this project than i'd like to admit, i gotta say that it's the best game of all time.  The engine foundation is pretty well developed.

As for gameplay features, the game can be concidered early. The current prototype contains many demonstratory features; enough to get started with a game, but not enough to keep you playing. You can settle cities, work on improvements and produce new cities, and view the tech tree.

The world contains opponent nations who have the beginnings of an AI system which allows them to explore and settle, just as you can.

Upcomming is the intergration between the production systems and the tech tree.

### Features
- Share a world between clients over the network.
- Pathfinding
- World generation system
- Spotify API intergration
- Custom state machine implementation
- Custom external state machine language
- Save / load a world disk
- Create & produce improvements for settlements
- Create units

#### State machine scripture
An aside to this project is `sms`, a simple ANTLR language which is an internal tool for developing state machines.

X6 contains a custom state machine implementation, but I found the boilerplate and api formatting tedious for implementing a state machine by hand, so I wrote simplified scripting format and compiler which translates it to Java using `JavaPoet`, implementing the machine.

## Help Window
> Help for players

Splash X6 is not a game of intuition, many find it confusing. 

In game the `help` window, located on the menu bar at the top of the screen, can be used to display [help text](https://github.com/Shinkson47/UniX6/blob/develop/core/assets/lang/helptext.plist), guiding you through starting with your first game and learning how to use the systems.

***SCREENSHOT***

## Wiki
> Help for players & contributors

More detailed and technical information about the engine and the various game systems can be found [here](https://github.com/Shinkson47/UniX6/wiki)

## Dokka
> Help for contributors

[Here](https://www.shinkson47.in/UniX6/) is the web version of the exported Kotlin documentation.

I try to add half decent documentation to my implementations. The Kotlin documentation export engine [Dokka](https://github.com/Kotlin/dokka) is used via gradle to export the technical documentation to [HMTL](https://github.com/Shinkson47/UniX6/tree/develop/docs/HTML) and [Github friendly Markdown](https://github.com/Shinkson47/UniX6/tree/develop/docs/markdown).

This web version is in the CI-CD pipeline, automatically deploying with up-to-date documentation on the master.

## Contribution
***Closed, for now.***

This project is moderated for my studies, excluding external contribution.
Expect the project to openly become FOSS, and accept of contribution around the end of this year.
