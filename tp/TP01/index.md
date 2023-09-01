---
type: TP
number: 1
---

# Rappels des bonnes pratiques de développement

Félicitations !
Vous venez d'être embauché·e dans une entreprise de services du numérique !
Pour votre premier projet, vous êtes intégré·e à une équipe travaillant sur
un programme de simulation de feux d'artifice, et dont la tâche est d'améliorer
le code existant afin de le rendre plus facilement maintenable sur le long
terme.

1. Constituez votre équipe en formant des groupes de 2 ou 3 membres.

## Identification des défauts de l'application

2. *Individuellement*, prenez connaissance du code de l'application fourni
   sur *Moodle* ou [ici](./src/FireworkShow.java).

3. *Individuellement*, essayez d'identifier les défauts de ce code, en utilisant
   les indications ci-dessous pour vous guider (vous pouvez dans un premier
   temps ne pas les consulter si vous souhaitez vous faire votre propre idée
   sur le code fourni).
   Attention cependant : tous les défauts ne sont pas référencés dans cette
   liste !
   - Les feux d'artifice peuvent avoir des tailles différentes, et cette taille
     influe sur la manière dont ils explosent.
     Quels sont les inconvénients d'avoir utilisé des entiers pour représenter
     cette taille ?
     Quel patron de conception pourrait permettre de gérer ces différences
     de comportement ?
   - Parfois, certains feux d'artifice ne fonctionnent pas comme prévu.
     Quel patron de conception pourrait permettre de vérifier qu'un feu
     d'artifice est hors service avant de le lancer ?
   - Les feux d'artifice peuvent être doubles, c'est-à-dire qu'ils explosent
     deux fois lorsqu'ils sont lancés.
     Quel patron de conception pourrait permettre de faire exploser deux fois
     un feu d'artifice existant ?
   - Observez qu'il est actuellement nécessaire de vérifier le type d'un feu
     d'artifice avant de le lancer, comme `Firework` et `BeesFirework` n'ont
     en commun que la classe `Object`.
     Quel patron de conception pourrait permettre de manipuler un `BeesFirework`
     comme un `Firework` *sans modifier la classe `BeesFirework`* ?
     Que pourrait-on changer au niveau de la variable `fireworks` du `main`
     pour tirer profit de ce changement ?
   - Notez qu'un `BeesFirework` n'a pas d'état, et que chaque instance de
     cette classe a en fait le même comportement que n'importe quelle autre.
     Quel patron de conception pourrait permettre de partager une même instance
     dans toute l'application ?
     Dans quelle classe devez-vous implanter ce patron de conception si vous ne
     souhaitez pas modifier la classe `BeesFirework` ?
   - Quels sont les inconvénients d'avoir utilisé des chaînes de caractères pour
     représenter la couleur des feux d'artifice ?
     Quels patrons de conception pourraient permettre de gérer cette couleur ?
     Plusieurs patrons sont possibles : lequel devez-vous utiliser pour
     permettre d'avoir des `BeesFirework` de différentes couleurs, *toujours
     sans changer cette classe* ?

4. Lorsque vous pensez avoir identifié tous les défauts dans le code, échangez
   *avec les membres de votre équipe* afin de confronter vos réponses à celles
   des autres membres du groupe.

5. *Tous ensembles*, partagez les défauts que vous avez identifiés *via*
   l'activité *Wooclap* mise en place par votre enseignant de TP.
   **Ne passez pas à la suite tant que cette étape n'a pas été réalisée.**

## Correction des défauts identifiés

6. *Au sein de votre groupe*, nommez un·e responsable qui sera chargé·e de
   créer un projet *GitLab* pour votre groupe, afin de corriger les défauts
   identifiés.
   Attribuez-vous ensuite des défauts à corriger en utilisant les tickets
   de votre projet.

7. *Individuellement*, réalisez les corrections des défauts qui vous ont été
   attribués à la question précédente.
   Vous veillerez à utiliser des branches pour cela.

8. Présentez vos solutions *aux autres membres de l'équipe*, et discutez des
   éventuelles améliorations possibles à vos solutions.

## Ajout de fonctionnalités supplémentaires (facultatif)

9. *En groupe*, attribuez-vous des nouvelles fonctionnalités parmi celles
   décrites ci-dessous dans votre programme, et complétez la fonction `main`
   pour les essayez.
   Comme dans la partie précédente, utilisez les tickets pour vous affecter les
   tâches à réaliser.
   - Modifiez la gestion des feux d'artifice hors service pour que les échecs
     de lancement apparaissent aléatoirement (à vous de choisir avec quelle
     probabilité un feu d'artifice échoue).
   - On souhaite avoir un feu d'artifice d'un type différent, comme
     les *comètes*, qui font des tracés dans le ciel (vous pouvez aussi choisir
     un autre type de feux d'artifice, en vous inspirant des exemples fournis à
     la Figure 1).
     Au moment où elles se déclenchent, les comètes produisent le son
     `PIOOOOUUUU`.
     Plusieurs solutions sont envisageables pour ajouter cette fonctionnalité.
   - On souhaite enfin avoir des feux d'artifice qui font exploser plusieurs
     feux d'artifice à la fois.
     Quel patron de conception permet de faire cela facilement ?

![
    Exemples de feux d'artifice, d'après
    [Tapp's Fireworks](https://www.tappsfireworks.com/single-post/2017/12/04/types-of-fireworks-effects).
](figures/fireworks.png)

10. *Individuellement*, implantez les nouvelles fonctionnalités qui vous ont été
    attribuées à la question précédente.
    Vous veillerez à utiliser des branches pour cela.

11. L'ajout des nouvelles fonctionnalités a-t-il été facile ?
    Qu'auriez-vous dû faire pour les ajouter si vous n'aviez pas modifié le
    code au préalable ?
    Réfléchissez à ces questions *individuellement*, puis discutez-en *avec
    les membres de votre équipe*.
