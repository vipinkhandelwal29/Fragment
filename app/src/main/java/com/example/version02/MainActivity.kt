package com.example.version02

import com.example.version02.adapter.PagerAdapter
import com.example.version02.databinding.ActivityMainBinding

class MainActivity : BaseActivity<ActivityMainBinding>() {

    override fun getLayoutId() = R.layout.activity_main


    override fun initControl() {
        val mainScreen = PagerAdapter(supportFragmentManager)
        binding.viewPager.adapter = mainScreen

        binding.selected = 1
        binding.llPhoto.setOnClickListener {
            binding.viewPager.currentItem = 0
            binding.selected = 1

        }
        binding.selected = 2
        binding.llMemory.setOnClickListener {
            binding.viewPager.currentItem = 1
            binding.selected = 2

        }

        binding.selected = 3
        binding.llAlbum.setOnClickListener {
            binding.viewPager.currentItem = 2
            binding.selected = 3

        }


    }
    /*val textView = findViewById<TextView>(R.id.textView)
    val photo = findViewById<LinearLayout>(R.id.l2)
    val memory = findViewById<LinearLayout>(R.id.l3)
    val album = findViewById<LinearLayout>(R.id.l4)
    val textPhoto = findViewById<TextView>(R.id.photoTv)
    val textMemory = findViewById<TextView>(R.id.memoryTv)
    val textAlbum = findViewById<TextView>(R.id.albumTv)
    val imagePhoto = findViewById<ImageView>(R.id.photo)
    val imageMemory = findViewById<ImageView>(R.id.memory)
    val imageAlbum = findViewById<ImageView>(R.id.album)





    var isPhoto: Boolean
    var isMemory: Boolean
    var isAlbum: Boolean

    photo.setOnClickListener(View.OnClickListener {


        supportFragmentManager.beginTransaction().replace(R.id.myLayout, FragmentOne()).commit()


        //font edit
        val font = ResourcesCompat.getFont(this, R.font.big_shoulders_displayextrabold)
        textView.text = ""
        textView.typeface = font


        textView.setText("Photo")
        isPhoto = true
        photo.setBackgroundColor(Color.GRAY)
        textPhoto.setTextColor(Color.BLUE)
        imagePhoto.setBackgroundColor(Color.BLUE)
        if (isPhoto) {
            memory.setBackgroundColor(Color.WHITE)
            textMemory.setTextColor(Color.BLACK)
            imageMemory.setBackgroundColor(Color.WHITE)

            album.setBackgroundColor(Color.WHITE)
            textAlbum.setTextColor(Color.BLACK)
            imageAlbum.setBackgroundColor(Color.WHITE)
            isMemory = false
            isAlbum = false
        }

    })

    //val typeface = Typeface.createFromAsset(assets,"big_shoulder_displayextrabold.ttf")

    memory.setOnClickListener(View.OnClickListener {
        supportFragmentManager.beginTransaction().replace(R.id.myLayout, FragmentTwo()).commit()
        memory.setBackgroundColor(Color.GRAY)
        textMemory.setTextColor(Color.BLUE)
        imageMemory.setBackgroundColor(Color.BLUE)
        textView.setText("Memory")
        isMemory = true
        if (isMemory) {
            photo.setBackgroundColor(Color.WHITE)
            textPhoto.setTextColor(Color.BLACK)
            imagePhoto.setBackgroundColor(Color.WHITE)

            album.setBackgroundColor(Color.WHITE)
            textAlbum.setTextColor(Color.BLACK)
            imageAlbum.setBackgroundColor(Color.WHITE)
            isPhoto = false
            isAlbum = false
        }
    })

    album.setOnClickListener(View.OnClickListener {

        supportFragmentManager.beginTransaction().replace(R.id.myLayout, FragmentThree()).commit()
        album.setBackgroundColor(Color.GRAY)
        textAlbum.setTextColor(Color.BLUE)
        imageAlbum.setBackgroundColor(Color.BLUE)
        textView.setText("Album")
        isAlbum = true
        if (isAlbum) {
            photo.setBackgroundColor(Color.WHITE)
            textPhoto.setTextColor(Color.BLACK)
            imagePhoto.setBackgroundColor(Color.WHITE)

            memory.setBackgroundColor(Color.WHITE)
            textMemory.setTextColor(Color.BLACK)
            imageMemory.setBackgroundColor(Color.WHITE)
            isPhoto = false
            isMemory = false

        }
    })*/


}
/*inline fun FragmentManager.inTransaction(func: FragmentTransaction.() -> Unit)
{
    val fragmentTransaction =beginTransaction()
    fragmentTransaction.func()
    fragmentTransaction.commit()
}*/

