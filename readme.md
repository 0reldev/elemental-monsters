# Elemental Monsters

## Introduction

This is a simple educational Java OOP exercise to handle classes and methods. The goal is to create a small game inspired by Pokémon to make fight elemental monsters.

## Instructions

### Goal 

At the beginning, we get an elemental monster which will fight against ennemies - other elemental monsters.

Turn by turn, monsters have one action possible. We can choose whether our champion monster attacks or heals itself.

The battles have three rounds, the goal is to win the three rounds!

### Elemental monster's definition

An Elemental Monster has four attributes : 
- strenght (integer from 0 to 9)
- intelligence (integer from 0 to 9)
- HP (hit points) (double, 40.0)
- an element (fire, water or air)

A monster behaves like this:
- when it attacks, the damages are worth its strenght + 1
- when it heals itself, it earns some HP which are worth its intelligence + 1
- our champion still attacks first

### Elements

Elements have the following effects:
- fire is efficient against air
- air is efficient against water
- water is efficient against fire

When an elemental monster attacks another one which has a weakest elements, the damages are double. 
- fire attacking air: damages x 2

If on the contrary a monster is attacked by another one having a weakest element, the damages are divided by 2.
- Air attacking fire: damages / 2

### Game controller

The main class is in charge of the game management and interactions with the player.

When the game starts, the initial values for intelligence and strenght are randomly generated, but the initial life still are 40.0 HP for our champion. The element is also randomly generated and stays the same for all the rounds.

Once that our champion is created, three random ennemies will fight. Each ennemy has random attribute values and element. Besides, its life is randomly generated between 10.0 HP and 30.0 HP.

Our champion still plays first when a round starts.

Ennemies still attack, and never heal itselves. 

Turn by turn, our champon and the ennemy have one action, till one of the monster die.

If an ennemy's life reach 0.0, our champion wins the round.

If our champion's life reach 0.0, the game is lost.

In the end of the three rounds, the number of victories is displayed.

## Execution example

![screen capture](https://github.com/0reldev/elemental-monsters/blob/master/screen-capture-1.png)

![screen capture](https://github.com/0reldev/elemental-monsters/blob/master/screen-capture-1.png)

![screen capture](https://github.com/0reldev/elemental-monsters/blob/master/screen-capture-1.png)
