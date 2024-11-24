package Lesson_22

fun main() {
    val viewModel = MainScreenViewModel()
    viewModel.loadData()
}
class MainScreenViewModel {
    data class MainScreenState(
        val data: String = "",
        val isLoading: Boolean = false
    )
    var mainScreenState = MainScreenState()
    fun loadData() {
        println("Отсутствие данных:$mainScreenState")
        mainScreenState = mainScreenState.copy(data = "Загрузка", isLoading = true)
        println("Загрузка данных:$mainScreenState")
        mainScreenState = mainScreenState.copy(data = "Загружено", isLoading = false)
        println("Наличие загруженных данных:$mainScreenState")
    }
}