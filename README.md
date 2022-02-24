# E-Commerce App
App que aborda conceitos de Clean Architecture juntamente com MVVM e componentes de arquitetura do [Android Jetpack](https://developer.android.com/jetpack?hl=pt-br). 
<br>São utilizados no projeto [LiveData](https://developer.android.com/topic/libraries/architecture/livedata?hl=pt-br), [ViewModel](https://developer.android.com/topic/libraries/architecture/viewmodel?hl=pt-br), [Navigation Component](https://developer.android.com/guide/navigation/navigation-getting-started), álem de escopos de [Coroutines](https://developer.android.com/topic/libraries/architecture/coroutines?hl=pt-br) e Injeção de dependência com [Hilt](https://developer.android.com/training/dependency-injection/hilt-android?hl=pt-br).
<br>A abordagem do app segue o conceito de White Label com Product Flavors, onde o mesmo projeto possui 4 Build Variants Genéricas sendo elas: 2 App's para comércio de Carros com Client e Admin e 2 App's para comércio de Bicicletas também com Client e Admin separados.
<br>O projeto utiliza o [Firebase](https://firebase.google.com/?hl=pt-br) para os 4 App's, onde é necessário configurar o projeto no mesmo
<br>e substituir o arquivo google-services.json gerado para que o app utilize o banco de dados.
<br>A listagem dos itens é feita através de [RecyclerView](https://developer.android.com/guide/topics/ui/layout/recyclerview?gclid=CjwKCAiAgbiQBhAHEiwAuQ6BktijAL5zFB3R9jZ8g8fB8mQ3iBRQaOV6jMsYr2l0iGXpuaBu9e4pqBoCWtwQAvD_BwE&gclsrc=aw.ds), utilizando List Adapter.
<br>A exibição das imagens é feita através da biblioteca [Glide](https://github.com/bumptech/glide).
<br>Utiliza-se também [Swiperefresh layout](https://developer.android.com/jetpack/androidx/releases/swiperefreshlayout?hl=pt-br) para atualizar os dados inseridos.
<br>
# Demonstração
<br>Exemplo dos App's de Bicicletas / Exemplo dos App's de Carros
<br>![exemplo](https://media0.giphy.com/media/rTPUGZvwbNrJuD5ATM/giphy.gif?cid=790b7611a562d84e303ee9800b6f3f0d76da52c268e18cde&rid=giphy.gif&ct=g)     ![exemplo2](https://media1.giphy.com/media/2ASEplGS47dFy7sBEh/giphy.gif?cid=790b76117cb309920cfac4ba51c45949504d8e0a5685bbde&rid=giphy.gif&ct=g)
