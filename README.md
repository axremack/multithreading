# ♨ TP7 Java - Multithreading

Programme exécutable via la ligne de commande permettant de générer un nombre de classes de manière séquentielle et de manière multithreadé. Les temps d'éxécution moyens sont ensuite affiché pour chacun des types d'éxécution afin de comparer la rapidité des méthodes.

## ✨ Installation
Télécharger le projet ou cloner le dépôt en local.
Il suffit ensuite de l'importer dans IntelliJ ou d'ouvrir un terminal pour l'utiliser.

## 🚀 Utilisation
### Lancement du programme
Il faut compiler le projet puis l'éxécuter à l'aide de l'interface graphique d'IntelliJ.
Dans un terminal, à l'intérieur du projet, taper la commande suivante pour afficher la comparaison des temps d'éxécution séquentielle et multithreadée :
```
/usr/lib/jvm/java-11-openjdk-amd64/bin/java -Dfile.encoding=UTF-8 -classpath /mnt/c/Users/axrem/Documents/ZZ3/Java/TP7/out/production/TP7 Main
```


## 📝 Détails sur le programme
### Utilité des classes
**Main.java** : lance le programme et exécute la génération de manière séquentielle puis multithreadée en affichant les performances respectives.<br/>
**Student.java** : classe à générer pour comparer les performances.<br/>
**StudentGenerator.java** : runnable permettant la génération séquentielle ou multithreadée de Student aux données aléatoires.<br/>
**StudentWriter.java** : écrit les objets sérialisés dans le fichier donné à la construction.<br/>

### Analyse des performances
A la lumière des analyses de performances menées au cours du développement, il parait plus optimisé d'utiliser des sous-listes pour la génération multithreadé d'objets : les threads peuvent alors remplir leur liste respective en même temps plutôt que d'attendre chacun à leur tour pour remplir une liste commune.<br/><br/>
On voit également que l'écriture dans le disque prends beaucoup plus de temps que la simple génération d'une liste. De plus, une exécution multithreadée n'améliore pas particulièrement les performances puisque l'accès à un fichier ne peut pas être concurrent.<br/><br/>
Après avoir enregistré les objets sérialisés dans le disque, les performances ne change pas du tout, ce qui parait assez intuitif puisque le fichier n'est pas extrêmement lourd.