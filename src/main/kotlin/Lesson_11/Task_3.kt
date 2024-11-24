package Lesson_11

fun main() {
    val memberFirst = Member(
        name = "Кирилл Королев",
        avatar = "png",
        status = "разговаривает",
    )

    val memberSecond = Member(
        name = "Иван Ветров",
        avatar = "jpg",
        status = "микрофон выключен",
    )
    val room = Room(
        cover = "png",
        nameOfRoom = " "
    )
    room.addMembers(memberFirst)
    room.addMembers(memberSecond)
    room.updateStatus("Кирилл Королев", "пользователь заглушен")
    println(room.members.toString())
}

class Member(
    val name: String,
    val avatar: String,
    var status: String,
)

class Room(
    val cover: String,
    val nameOfRoom: String,
    val members: MutableList<Member> = mutableListOf(),
) {
    fun addMembers(member: Member) {
        members.add(member)
    }
    fun updateStatus(memberName: String, newStatus: String) {
        val member = members.find { it.name == memberName }
        if (member != null) {
            member.status = newStatus
        } else {
            println("Участник не найден.")
        }
    }
}