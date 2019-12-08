package com.niki.movayapp.utils

import com.niki.movayapp.data.MovieEntity
import com.niki.movayapp.data.TvEntity

object DataDummy {
    fun generateMovies(): ArrayList<MovieEntity> {
        var movies: ArrayList<MovieEntity> = ArrayList()
        movies.add(
            MovieEntity(
                "Frozen II",
                2019,
                "Animation, Family, Music",
                "1h 44m",
                "Chris Buck",
                70,
                "Elsa, Anna, Kristoff and Olaf head far into the forest to learn the truth about an ancient mystery of their kingdom.",
                "https://image.tmdb.org/t/p/w1280/qdfARIhgpgZOBh3vfNhWS4hmSo3.jpg"
            )
        )
        movies.add(
            MovieEntity(
                "The Irishman",
                2019,
                "Crime, History, Drama",
                "3h 29m",
                "Martin Scorsese",
                81,
                "Pennsylvania, 1956. Frank Sheeran, a war veteran of Irish origin who works as a truck driver, accidentally meets mobster Russell Bufalino. Once Frank becomes his trusted man, Bufalino sends him to Chicago with the task of helping Jimmy Hoffa, a powerful union leader related to organized crime, with whom Frank will maintain a close friendship for nearly twenty years.",
                "https://image.tmdb.org/t/p/w1280/mbm8k3GFhXS0ROd9AD1gqYbIFbM.jpg"
            )
        )
        movies.add(
            MovieEntity(
                "Rambo: Last Blood",
                2019,
                "Action, Thriller, Drama",
                "1h 29m",
                "Adrian Grunberg",
                59,
                "After fighting his demons for decades, John Rambo now lives in peace on his family ranch in Arizona, but his rest is interrupted when Gabriela, the granddaughter of his housekeeper María, disappears after crossing the border into Mexico to meet her biological father. Rambo, who has become a true father figure for Gabriela over the years, undertakes a desperate and dangerous journey to find her.",
                "https://image.tmdb.org/t/p/w1280/kTQ3J8oTTKofAVLYnds2cHUz9KO.jpg"
            )
        )
        movies.add(
            MovieEntity(
                "Joker",
                2019,
                "Action, Thriller, Drama",
                "2h 2m",
                "Todd Phillips",
                84,
                "During the 1980s, a failed stand-up comedian is driven insane and turns to a life of crime and chaos in Gotham City while becoming an infamous psychopathic crime figure.",
                "https://image.tmdb.org/t/p/w1280/udDclJoHjfjb8Ekgsd4FDteOkCU.jpg"
            )
        )
        movies.add(
            MovieEntity(
                "Jumanji: The Next Level",
                2019,
                "Action, Adventure, Comedy, Fantasy",
                "2h 3m",
                "Jake Kasdan",
                73,
                "Spencer returns to the world of Jumanji, prompting his friends, his grandfather and his grandfather’s friend to enter a different and more dangerous version to save him.",
                "https://image.tmdb.org/t/p/w1280/tmItDhOFsRgFlxX9VaWJEGfstJV.jpg"
            )
        )
        movies.add(
            MovieEntity(
                "IP MAN 4: The Finale",
                2019,
                "Action, Drama, History",
                null,
                "Wilson Yip",
                null,
                "Ip Man 4 is an upcoming Hong Kong biographical martial arts film directed by Wilson Yip and produced by Raymond Wong. It is the fourth in the Ip Man film series based on the life of the Wing Chun grandmaster of the same name and features Donnie Yen reprising the role. The film began production in April 2018 and ended in July the same year.",
                "https://image.tmdb.org/t/p/w1280/vn94LlNrbUWIZZyAdmvUepFBeaY.jpg"
            )
        )
        movies.add(
            MovieEntity(
                "It Chapter Two",
                2019,
                "Horor, Drama",
                "2h 49m",
                "Andy Muschietti",
                68,
                "27 years after overcoming the malevolent supernatural entity Pennywise, the former members of the Losers' Club, who have grown up and moved away from Derry, are brought back together by a devastating phone call.",
                "https://image.tmdb.org/t/p/w1280/zfE0R94v1E8cuKAerbskfD3VfUt.jpg"
            )
        )
        movies.add(
            MovieEntity(
                "Once Upon a Time... In Hollywood",
                2019,
                "Comedy, Drama, Thriller",
                "2h 42m",
                "Quentin Tarantino",
                75,
                "Los Angeles, 1969. TV star Rick Dalton, a struggling actor specialized in westerns, and stuntman Cliff Booth, his best friend, try to survive to a constantly changing movie industry. Dalton is neighbor of the young and promising actress and model Sharon Tate, who has just married the prestigious Polish director Roman Polanski…",
                "https://image.tmdb.org/t/p/w1280/8j58iEBw9pOXFD2L0nt0ZXeHviB.jpg"
            )
        )
        movies.add(
            MovieEntity(
                "Terminator: Dark Fate",
                2019,
                "Action, Science Fiction",
                "2h 28m",
                "Tim Miller",
                63,
                "Decades after Sarah Connor prevented Judgment Day, a lethal new Terminator is sent to eliminate the future leader of the resistance. In a fight to save mankind, battle-hardened Sarah Connor teams up with an unexpected ally and an enhanced super soldier to stop the deadliest Terminator yet.",
                "https://image.tmdb.org/t/p/w1280/vqzNJRH4YyquRiWxCCOH0aXggHI.jpg"
            )
        )
        movies.add(
            MovieEntity(
                "Ad astra",
                2019,
                "Science Fiction",
                "2h 4m",
                "James Gray",
                61,
                "An astronaut travels to the outer edges of the solar system to find his father and unravel a mystery that threatens the survival of Earth. In doing so, he uncovers secrets which challenge the nature of human existence and our place in the cosmos.",
                "https://image.tmdb.org/t/p/w1280/xJUILftRf6TJxloOgrilOTJfeOn.jpg"
            )
        )
        return movies
    }
    fun generateTvShows(): ArrayList<TvEntity> {
        var tv: ArrayList<TvEntity> = ArrayList()
        tv.add(
            TvEntity(
                "The Mandalorian",
                2013,
                "SCI-FI Fantasy",
                "35m",
                "Jon Favreau",
                77,
                "Set after the fall of the Empire and before the emergence of the First Order, we follow the travails of a lone gunfighter in the outer reaches of the galaxy far from the authority of the New Republic.",
                "https://image.tmdb.org/t/p/w1280/BbNvKCuEF4SRzFXR16aK6ISFtR.jpg"
            )
        )
        tv.add(
            TvEntity(
                "Rick and Morty",
                2013,
                "SCI-FI Fantasy",
                "22m",
                "Dan Harmon",
                86,
                "Rick is a mentally-unbalanced but scientifically-gifted old man who has recently reconnected with his family. He spends most of his time involving his young grandson Morty in dangerous, outlandish adventures throughout space and alternate universes. Compounded with Morty's already unstable family life, these events cause Morty much distress at home and school.",
                "https://image.tmdb.org/t/p/w1280/qJdfO3ahgAMf2rcmhoqngjBBZW1.jpg"
            )
        )
        tv.add(
            TvEntity(
                "Vikings",
                2013,
                "Action and Adventure, Drama",
                "60m",
                "Michael Hirst",
                75,
                "The adventures of Ragnar Lothbrok, the greatest hero of his age. The series tells the sagas of Ragnar's band of Viking brothers and his family, as he rises to become King of the Viking tribes. As well as being a fearless warrior, Ragnar embodies the Norse traditions of devotion to the gods. Legend has it that he was a direct descendant of Odin, the god of war and warriors.",
                "https://image.tmdb.org/t/p/w1280/ff1zhqvwfS5HvRNcA5UFrH0PA2q.jpg"
            )
        )
        tv.add(
            TvEntity(
                "The Simpsons",
                1989,
                "Animation, Comedy",
                "22m",
                "Matt Groening",
                75,
                "Set in Springfield, the average American town, the show focuses on the antics and everyday adventures of the Simpson family; Homer, Marge, Bart, Lisa and Maggie, as well as a virtual cast of thousands. Since the beginning, the series has been a pop culture icon, attracting hundreds of celebrities to guest star. The show has also made name for itself in its fearless satirical take on politics, media and American life in general.",
                "https://image.tmdb.org/t/p/w1280/yTZQkSsxUFJZJe67IenRM0AEklc.jpg"
            )
        )
        tv.add(
            TvEntity(
                "Arrow",
                2012,
                "Crime, Drama",
                "42m",
                "Greg Bellanti",
                58,
                "Spoiled billionaire playboy Oliver Queen is missing and presumed dead when his yacht is lost at sea. He returns five years later a changed man, determined to clean up the city as a hooded vigilante armed with a bow.",
                "https://image.tmdb.org/t/p/w1280/gKG5QGz5Ngf8fgWpBsWtlg5L2SF.jpg"
            )
        )
        tv.add(
            TvEntity(
                "The Flash",
                2014,
                "Drama, Science Fiction",
                "44m",
                "Geof Johns",
                67,
                "After a particle accelerator causes a freak storm, CSI Investigator Barry Allen is struck by lightning and falls into a coma. Months later he awakens with the power of super speed, granting him the ability to move through Central City like an unseen guardian angel. Though initially excited by his newfound powers, Barry is shocked to discover he is not the only \"meta-human\" who was created in the wake of the accelerator explosion -- and not everyone is using their new powers for good. Barry partners with S.T.A.R. Labs and dedicates his life to protect the innocent. For now, only a few close friends and associates know that Barry is literally the fastest man alive, but it won't be long before the world learns what Barry Allen has become...The Flash.",
                "https://image.tmdb.org/t/p/w1280/wHa6KOJAoNTFLFtp7wguUJKSnju.jpg"
            )
        )
        tv.add(
            TvEntity(
                "Supernatural",
                2005,
                "Drama, Mistery",
                "45m",
                "Erik Kripke",
                74,
                "When they were boys, Sam and Dean Winchester lost their mother to a mysterious and demonic supernatural force. Subsequently, their father raised them to be soldiers. He taught them about the paranormal evil that lives in the dark corners and on the back roads of America ... and he taught them how to kill it. Now, the Winchester brothers crisscross the country in their '67 Chevy Impala, battling every kind of supernatural threat they encounter along the way.",
                "https://image.tmdb.org/t/p/w1280/KoYWXbnYuS3b0GyQPkbuexlVK9.jpg"
            )
        )
        tv.add(
            TvEntity(
                "4 Blocks",
                2017,
                "Drama",
                "50m",
                "Hanno Hackfort",
                44,
                "Based in Neukölln, Berlin Toni manages the daily business of dealing with the Arabic gangs and ends up wanting to leave his old life behind for his family, but as expected, its never that simple.",
                "https://image.tmdb.org/t/p/w1280/jVObyxtNxuPbG5czuKvm7pW56EV.jpg"
            )
        )
        tv.add(
            TvEntity(
                "His Dark Materials",
                2019,
                "Drama",
                "59m",
                "Philip Pullmas",
                77,
                "Lyra is an orphan who lives in a parallel universe in which science, theology and magic are entwined. Lyra's search for a kidnapped friend uncovers a sinister plot involving stolen children, and turns into a quest to understand a mysterious phenomenon called Dust. She is later joined on her journey by Will, a boy who possesses a knife that can cut windows between worlds. As Lyra learns the truth about her parents and her prophesied destiny, the two young people are caught up in a war against celestial powers that ranges across many worlds.",
                "https://image.tmdb.org/t/p/w1280/xOjRNnQw5hqR1EULJ2iHkGwJVA4.jpg"
            )
        )
        tv.add(
            TvEntity(
                "Riveldale",
                2019,
                "Drama, Mistery",
                "45m",
                "Roberto Aguirre-Sacasa",
                73,
                "Set in the present, the series offers a bold, subversive take on Archie, Betty, Veronica and their friends, exploring the surreality of small-town life, the darkness and weirdness bubbling beneath Riverdale’s wholesome facade.",
                "https://image.tmdb.org/t/p/w1280/4X7o1ssOEvp4BFLim1AZmPNcYbU.jpg"
            )
        )
        return tv
    }
}