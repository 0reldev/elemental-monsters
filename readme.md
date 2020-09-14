# Elemental Monsters

Le monde est peuplé de Monstres Élémentaires, invisibles pour le commun des mortels. Cependant, ayant appris les bases de Java, tu fais désormais parti de l'élite : il t'est donc possible de voir ces créatures !

Les Monstres Élémentaires n'ont qu'un seul but dans la vie : combattre ! Mais ils sont très mauvais pour choisir leurs attaques en fonction de leurs adversaires : tu décides donc de devenir coach de Monstre Élémentaire.

Ton rôle consiste à choisir un Monstre Élémentaire - ton champion ! - et en fonction de l'adversaire qu'il combattra, de lui donner des consignes parmis les suivantes :

* attaquer
* se soigner

Ton but est de réussir, sur 3 combats aléatoires successifs, d'en gagner un maximum !

## Qu'est-ce qu'un Monstre Élémentaire

Un Monstre Élémentaire possède les attributs suivants :

* force (de 0 à 9)
* intelligence (de 0 à 9)
* point de vie (commence toujours à 40)
* un élément (qui est soit feu, eau ou air)

Les comportements sont les suivants :

* Lorsqu'il attaque, il inflige un nombre de dégât lié à sa force + 1.
* Lorsqu'il se soigne, il gagne un nombre de point de vie lié à son intelligence + 1.
* Ton Monstre Élémentaire attaque toujours en premier !

## Le pouvoir des éléments

Les éléments ont un effet entre eux :

* le feu est efficace contre l'air
* l'air est efficace contre l'eau
* l'eau est efficace contre le feu

Lorsqu'un Monstre Élémentaire attaque contre un élément dont il est efficace, il fait inflige deux fois plus de dégâts.

* Feu attaque air : dégâts x 2

Lorsqu'un Monstre Élémentaire est attaqué par un élément dont il est efficace, il reçoit deux fois moins de dégâts.

* Air attaque feu : dégâts / 2

## Le contrôleur du jeu

La classe principale est en charge de la gestion du jeu et des interactions avec l'utilisateur.

Au lancement du jeu, le programme sélectionne aléatoirement les valeurs des attributs de force et d'intelligence, entre 0 et 9. Son nombre de point de vie sera toujours égal à 40.

Ensuite le programme sélectionne alétoirement l'élément de son champion parmi le feu, l'eau et l'air.

## Déroulé d'une partie

Une fois le champion créé, trois adversaires vont successivement le combattre. Chaque adversaire à ses attributs et élément attribués aléatoirement. De plus, ces points de vies sont sélectionnés aléatoirement entre 10 et 30.

* Lors d'un combat, le champion agit toujours le premier.
* Les adversaires n'ayant pas de coach, ils ne font qu'attaquer et ne se soigne pas.
* Le champion et l'adversaire agissent alternativement, jusqu'à ce que l'un d'eux n'ait plus de point de vie.
* Si un adversaire n'a plus de point de vie, le champion gagne le combat et continue la partie.
* Si le champion n'a plus de point de vie, le combat est perdu et la partie s'arrête.
* À la fin de la partie, le nombre de combat gagné est affiché.

## Comment s'y prendre ?

Réfléchissez aux différents "acteurs" du programme : il composeront les différentes classes.

Un état (point de vie...) est représenté par un attribut et un comportement (attaquer...) est une méthode.

Une classe principale, avec un point d'entrée, sera le chef d'orchestre du programme : c'est lui qui créera et fera appel aux différents objets et à leurs méthodes.