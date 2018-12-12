package at.fh.swengb.collectionsandrecyclerview

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        Log.i("Student", "${list[2].name}")

        Log.i("Student", "${mutablelist[3].name}")

        mutablelist.add(Student("Rob6", 1))

        mutableset.add(Student("SetRob5", 2))
        mutableset.add(Student("Lagertha", 6))

        for (studentname in mutablelist) {
            Log.i("Student", "${studentname.name}")
        }

        for (studentname in set) {
            Log.i("Student", "${studentname.name}")
        }

        for (studentname in mutableset) {
            Log.i("Student", "${studentname.name}, ${studentname.currentSemester}")
        }

        for (studentname in mutableset) {
            if (studentname.name == "Rob") {
                Log.i("Student", "${studentname.name}, ${studentname.currentSemester}")
            }
        }

        ima17List.add(Student("Daenerys", 6))

        for ((key, value) in studentMap) {
            for (studentname in value) {
                Log.i("Student", "${key}, ${studentname.name}, ${studentname.currentSemester}")
            }
        }

        val newStudentMap = studentMap.toMutableMap()

        newStudentMap.put("IMA16", ima16List)

        for ((key, value) in newStudentMap) {
            for (studentname in value) {
                Log.i("Student", "${key}, ${studentname.name}, ${studentname.currentSemester}")
            }
        }

    }


    val list = listOf<Student>(
        Student("Rob1", 2),
        Student("Rob2", 3),
        Student("Rob3", 2),
        Student("Rob4", 2),
        Student("Rob5", 2)
    )

    val mutablelist = mutableListOf<Student>(
        Student("Rob1", 2),
        Student("Rob2", 3),
        Student("Rob3", 2),
        Student("Rob4", 2),
        Student("Rob5", 2)
    )

    val set = setOf<Student>(
        Student("SetRob1", 2),
        Student("SetRob2", 3),
        Student("SetRob1", 2),
        Student("SetRob4", 2),
        Student("SetRob5", 2)
    )

    val mutableset = mutableSetOf<Student>(
        Student("Rob", 2),
        Student("SetRob2", 3),
        Student("SetRob1", 2),
        Student("SetRob4", 2),
        Student("SetRob5", 2)
    )

    val ima18List = listOf(Student("Tyrion", 1), Student("Jon", 1))
    val ima17List = mutableListOf(Student("Sansa", 3), Student("Arya", 3), Student("Bran", 3))
    val studentMap = mapOf<String, List<Student>>("IMA18" to ima18List, "IMA17" to ima17List)
    val ima16List = listOf(Student("Hound", 5), Student("Mountain", 5))

}
