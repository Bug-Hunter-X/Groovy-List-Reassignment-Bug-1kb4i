# Groovy List Reassignment Bug

This repository demonstrates a common, subtle bug in Groovy related to list reassignment.  In Groovy, lists are mutable, but reassigning a list variable does not modify the original list; it creates a new list. This can lead to unexpected behavior if you're not aware of this distinction.

## Bug Description

The `bug.groovy` file contains a simple Groovy script that demonstrates this issue. The script adds an element to a list, then reassigns the list variable to a new list. The output shows that the original list is not modified, which might be unexpected for developers coming from strongly-typed languages.

## Solution

The `bugSolution.groovy` file demonstrates how to correctly modify the list in place, ensuring the original list reflects the changes.  This is achieved by using methods that modify the list directly, rather than reassigning the variable.

## How to Reproduce

1. Clone this repository.
2. Run `bug.groovy` using a Groovy interpreter (e.g., `groovy bug.groovy`). Observe the unexpected output.
3. Run `bugSolution.groovy` and compare the output, noting the corrected behavior.