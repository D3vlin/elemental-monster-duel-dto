# elemental-monster-duel-dto

## 📌 Overview

**elemental-monster-duel-dto** is one of 6 repositories in the distributed
architecture of Elemental Monster Duel. It holds plain data-transfer objects —
the response/request shapes used by the rest of the ecosystem, independent of
how the underlying data is stored or persisted.

---

## 🎯 Purpose

This repository exists to:

- Define a stable response/request shape, independent of how data is persisted
- Provide a conversion target that doesn't depend on any persistence detail
- Host the domain vocabulary shared across modules, so it has one single source

---

## 🧱 Project Architecture Context

This repo is one of 6 in the Elemental Monster Duel ecosystem, each
independently versioned and maintained:

| Module | Responsibility | Repository |
|---|---|---|
| `db` | Database schema | https://github.com/D3vlin/elemental-monster-duel-db |
| `entity` | JPA mapping | https://github.com/D3vlin/elemental-monster-duel-entity |
| `dto` | Data transport | — (this) |
| `mapper` | Entity ↔ DTO | https://github.com/D3vlin/elemental-monster-duel-mapper |
| `api` | REST interface | https://github.com/D3vlin/elemental-monster-duel-api |
| `ui` | Frontend | https://github.com/D3vlin/elemental-monster-duel-ui |

---

## 🚀 Why a Dedicated DTO Module?

- This module's shapes can evolve on their own schedule, independent of how
  the data is persisted
- A fixed conversion target, usable from both directions
- Depending on it never pulls in any persistence or transport concern

---

## License

No license — all rights reserved.
