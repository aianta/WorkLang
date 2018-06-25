# Worklang Motivation

## Software Ecosystems
Software ecosystems are the future of computing. Any sufficiently large group with IT systems (enterprises, startups, open source communities, etc.) eventually ends up building multiple software components. 

At some point, there is a desire to interweave, reuse, or at least collectively expose various subsets of these components (a la API Gateways).

## The Standard Approach
This desire is often fulfilled by enforcing a standard across components so they may interact knowing that some common set of assumptions are true for themselves and all other components in the ecosystem.

### Where standards go to die...
However, there are many cases where this solution fails, because:

- A standard cannot be agreed upon.

- The creators of the standard do not have jurisdiction over components in an ecosystem, resulting in components which do not or only partially support the standard.
- The cost of retrofitting legacy components to meet the standard is too high.

- Multiple versions of the same standard and inconsistent or undocumented implementations render the effort useless and costly.

- The standard changes to facilitate new functionality faster than complying components can implement changes.

The Worklang stack is a set of tools for creating self-aware networks of resources called **worknets**.

## Introducing Worknets
Unlike traditional software ecosystems, worknets require no standard to provide interaction, reuse, and/or collective exposure of resource functionality.

### How do worknets help?
Worknets work, by abstracting away the details of software interaction, from the software being interacted with.

This allows applications to discover and interact with each other through the worknet, even if they cannot do so directly.

For example, the resource that renders an in-game leaderboard, maybe unable to process the games community forum accounts as players with a score, but it can engage the worknet to transform forum accounts into player objects on demand, or when new forum accounts are created or edited.

### What makes worknets...work?
Worknets create a sort of *living standard* in the form of a **meta model** which describes what resources are available, how to interact with them, and how they interact with each other to satisfy business requirements or user stories.

A worknet is said to be self-aware because it can **read**, **write** and **execute** against its own meta model, allowing it to change its architecture and propagate relevant parts of those changes to the resources within it.


