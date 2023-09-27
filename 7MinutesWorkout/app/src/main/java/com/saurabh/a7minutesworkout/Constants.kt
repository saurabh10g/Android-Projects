package com.saurabh.a7minutesworkout

object Constants {
    fun defaultExerciseList(): ArrayList<ExerciseModel>
    {
        val exerciseList=ArrayList<ExerciseModel>()

        val jumpingJacks = ExerciseModel (
            id = 1,
            "Jumping Jacks",
            R.drawable.ic_jumping_jacks,
            false,
            false
        )
        exerciseList.add(jumpingJacks)

        val abdominalCrunch = ExerciseModel (
            id = 2,
            "Abdominal Crunch",
            R.drawable.ic_abdominal_crunch,
            false,
            false
        )
        exerciseList.add(abdominalCrunch)

        val highKneesRunningInSpace = ExerciseModel (
            id = 3,
            "High Knees running In Space",
            R.drawable.ic_high_knees_running_in_place,
            false,
            false
        )
        exerciseList.add(highKneesRunningInSpace)

        val lunge = ExerciseModel (
            id = 4,
            "Lunge",
            R.drawable.ic_lunge,
            false,
            false
        )
        exerciseList.add(lunge)

        val planks = ExerciseModel (
            id = 5,
            "Planks",
            R.drawable.ic_plank,
            false,
            false
        )
        exerciseList.add(planks)

        val pushUp = ExerciseModel (
            id = 6,
            "Push Ups",
            R.drawable.ic_push_up,
            false,
            false
        )
        exerciseList.add(pushUp)

        val pushUpAndRotation = ExerciseModel (
            id = 7,
            "Push Up And Rotation",
            R.drawable.ic_push_up_and_rotation,
            false,
            false
        )
        exerciseList.add(pushUpAndRotation)

        val sidePlank = ExerciseModel (
            id = 8,
            "Side Plank",
            R.drawable.ic_side_plank,
            false,
            false
        )
        exerciseList.add(sidePlank)

        val squat = ExerciseModel (
            id = 9,
            "Squat",
            R.drawable.ic_squat,
            false,
            false
        )
        exerciseList.add(squat)

        val stepUpOntoChair = ExerciseModel (
            id = 10,
            "Step Up Onto Chair",
            R.drawable.ic_step_up_onto_chair,
            false,
            false
        )
        exerciseList.add(stepUpOntoChair)

        val tricepsDipOnChair = ExerciseModel (
            id = 11,
            "Triceps Dip On Chair",
            R.drawable.ic_triceps_dip_on_chair,
            false,
            false
        )
        exerciseList.add(tricepsDipOnChair)

        val wallSit = ExerciseModel (
            id = 12,
            "Wall Sit",
            R.drawable.ic_wal_sit,
            false,
            false
        )
        exerciseList.add(wallSit)

        return exerciseList
    }
}