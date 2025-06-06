# CLAUDE.md

This file provides guidance to Claude Code (claude.ai/code) when working with code in this repository.

## Repository Overview

This is an educational Java project focused on teaching data structures and algorithms with a unique emphasis on developing problem-solving thinking skills. The content is primarily in Chinese and follows a structured learning curriculum.

## Build and Run Commands

The project uses manual Java compilation without a build system:

```bash
# Compile and run lessons
javac lessons/Lesson01_Arrays.java
java -cp . lessons.Lesson01_Arrays

# Compile and run exercises
javac exercises/ArrayExercises.java
java -cp . exercises.ArrayExercises

# Compile and run thinking process examples
javac thinking-process/ProblemSolvingMindset.java
java -cp . thinking-process.ProblemSolvingMindset
```

Note: The project has a nested directory issue (`lessons/lessons/`) that may require path adjustments.

## Project Architecture

The codebase follows a learning-oriented structure with four main components:

1. **LearningPath.java** - Main entry point providing a 20-lesson curriculum roadmap spanning 12-15 weeks
2. **lessons/** - Sequential lessons teaching data structures concepts (currently has Lesson01_Arrays.java)
3. **exercises/** - Practice problems corresponding to each lesson (ArrayExercises.java for arrays)
4. **thinking-process/** - Meta-learning content focused on problem-solving methodology, containing:
   - ProblemSolvingMindset.java - Core thinking framework showing how to approach problems
   - ThinkingExamples.java - Concrete examples demonstrating thought processes
   - ThinkingTraining.java - Exercises to develop algorithmic thinking

Each Java file is self-contained with:
- Main method for direct execution
- Embedded test methods (no external test framework)
- Comprehensive Chinese documentation
- Interactive examples and exercises

## Development Notes

- Java version: 17
- Character encoding: UTF-8
- All comments and output are in Chinese
- No external dependencies or build tools
- Tests are embedded in main classes as `testExerciseX()` methods