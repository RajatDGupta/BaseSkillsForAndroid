package com.solidprinciple


/**
 * Created by 1000292 on 23-08-2022
 * BFDL
 * PUNE.
 */

/**
   Single Responsibility principle
   The Single responsibility Principle states that every
   class should have one and only one responsibility. In other words,
   If there is a need to change the class for more than one reason then
   that defies the single responsibility principle.
 */

// https://www.freecodecamp.org/news/kriptofolio-app-series-part-1/
// https://medium.com/android-news/android-development-the-solid-principles-3b5779b105d2
// https://proandroiddev.com/exploring-s-o-l-i-d-principle-in-android-a90947f57cf0
/*

class MusicVinylRecordRecyclerViewAdapter(private val vinyls: List<VinylRecord>, private val itemLayout: Int)
    : RecyclerView.Adapter<MusicVinylRecordRecyclerViewAdapter.ViewHolder>() {
    ...
    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        val vinyl = vinyls[position]
        holder.itemView.tag = vinyl

        holder.title!!.text = vinyl.title
        holder.author!!.text = vinyl.author
        holder.releaseYear!!.text = vinyl.releaseYear
        holder.country!!.text = vinyl.country
        holder.condition!!.text = vinyl.condition

        */
/**
         * Instead of performing data formatting operations here, we move that responsibility to
         * other class. Actually here you see only direct call of top-level function
         * convertArrayListToString - new Kotlin language feature. However don't be mistaken,
         * because Kotlin compiler behind the scenes still is going to create a Java class, and
         * than the individual top-level functions will be converted to static methods. So single
         * responsibility for each class.
         *//*


        holder.genre!!.text =  convertArrayListToString(vinyl.genres)
    }
    ...
}
*/
