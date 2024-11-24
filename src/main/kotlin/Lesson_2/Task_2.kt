package Lesson_2

fun main() {
    val countOfWorkers = 50
    val workersSalary = 30000
    val countOfTrainees = 30
    val traineesSalary = 20000

    val summOfWorkersAndTrainees = countOfWorkers + countOfTrainees
    val expencesOnWorkersSalary = countOfWorkers * workersSalary
    val expencesOnTraineesSalary = countOfTrainees * traineesSalary
    val summonCountOfSalaries = expencesOnWorkersSalary + expencesOnTraineesSalary
    val averageSalaryOfOneWorker = summonCountOfSalaries / summOfWorkersAndTrainees

    println(expencesOnWorkersSalary)
    println(summonCountOfSalaries)
    println(averageSalaryOfOneWorker)
}