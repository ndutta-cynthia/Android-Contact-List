package me.cynthiamaina

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.recyclerview.widget.LinearLayoutManager
import me.cynthiamaina.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.rvContacts.layoutManager = LinearLayoutManager(this)
        displayContacts()


    }
    fun displayContacts(){
        val contact1= Contact("Abraham", "0700000000","abu@gmail.com","")
        val contact2= Contact("Miriam", "0700000001","millie@gmail.com","")
        val contact3= Contact("Jack", "0700000002","jack@gmail.com","")
        val contact4= Contact("Joseph", "0700000003","josee@gmail.com","")
        val contact5= Contact("Mark", "0700000004","mark@gmail.com","")
        val contact6= Contact("Grace", "0700000005","grace@gmail.com","")
        val contact7= Contact("Cyrus", "0700000006","cyrus@gmail.com","")
        val contact= Contact("Stephen", "0700000007","steve@gmail.com","")
        val contactList= listOf(contact1,contact2,contact3,contact4,contact5,contact6,contact7)
        val contactsAdapter = ContactsAdapter(contactList)
        binding.rvContacts.adapter = contactsAdapter
    }
}