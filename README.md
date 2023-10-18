## Spring Data JPA - Optimisation

Dans ce repo nous allons voir quelques astuces d'optimisation des performances avec Spring Data JPA.

Voici quelques conseils pour vous aider à optimiser les performances lors de l’utilisation de Spring Data JPA :

- Utiliser une indexation appropriée
    - Analysez les plans d'exécution des requêtes et identifiez les colonnes fréquemment utilisées dans les clauses
      WHERE, JOIN et ORDER BY. Créez des index sur ces colonnes pour accélérer la récupération des données.
    - Évitez une indexation excessive, car cela peut avoir un impact sur les performances d’insertion/mise à jour.
      Trouvez un équilibre entre les opérations de lecture et d’écriture.
- Choisissez des stratégies de récupération appropriées
    - Choisissez des stratégies de récupération appropriées pour les associations (par exemple, chargement différé) afin
      d'éviter un chargement inutile d'entités associées.
    - Utilisez JOIN FETCHdes clauses explicites dans les requêtes JPQL pour récupérer les entités associées dans une
      seule requête si nécessaire.
- Mise en cache
    - Activez la mise en cache avec Spring Cache ou des solutions tierces comme Ehcache ou Caffeine pour stocker en
      mémoire les données fréquemment consultées, réduisant ainsi les accès à la base de données.
    - Utilisez la mise en cache de deuxième niveau pour mettre en cache les données entre les sessions. Spring Boot
      prend en charge divers fournisseurs de mise en cache.
- Optimisation des requêtes
    - Écrivez des requêtes JPQL ou API Criteria efficaces qui récupèrent uniquement les données requises. Évitez
      d'utiliser SELECT *.
    - Utilisez les projections appropriées (par exemple, `SELECT NEW` ou les projections DTO) pour récupérer uniquement
      les
      champs nécessaires.
- Utilisez la pagination et le tri
- Opérations en lecture seule - Marquez les transactions en lecture seule avec `@Transactional(readOnly = true)`
- Opérations par lots - Utilisez le traitement par lots pour les insertions, mises à jour et suppressions en masse.
  Spring Data JPA prend en charge les opérations par lots via les méthodes saveAll()et deleteAllInBatch().
- Évitez le problème de requête N+1 - utiliser des requêtes explicites avec des jointures (JPQL ou Criteria API) pour
  récupérer les données dont vous avez besoin en une seule requête

### Technologies
---

- Java 17
- Spring Boot 3
- Spring Data JPA
- Lombok
- MapStruct
- Maven 3+
- PostgreSQL
