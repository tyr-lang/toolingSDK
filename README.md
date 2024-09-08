<p align="center">
  <img src="logoSmall.png" width="24">
  Tyr Tooling SDK
  <img src="logoSmall.png" width="24">
</p>

It allows detatching tooling release cycles from compiler and language releases.
It is meant as basis for open-source tooling in the Tyr ecosystem.
The SDK is the basis of Java-based Tyr tooling operating on annotated ASTs.
However, it can be taken as blueprint for tooling implemented in any other language with an OGSS binding.

The SDK consists of two parts:
1. [the OGSS specification](aast.skill) to generate the Tyr AAST API
2. a set of library functions to simplify common tasks such as creating human-readable names for declarations or expressions
