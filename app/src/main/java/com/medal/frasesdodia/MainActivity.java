package com.medal.frasesdodia;

        import android.support.v7.app.AppCompatActivity;
        import android.os.Bundle;
        import android.view.View;
        import android.widget.TextView;

        import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void gerarNovaFrase(View view) {

        String[] frases = {"Hoje seu dia será especial. Muito melhor que ontem e um aprendizado para amanhã. Hoje você tem a oportunidade de fazer as coisas diferentes. Tenha um ótimo dia!",
                "As pessoas se tornam especiais por vários motivos. Você não precisa disso, já nasceu especial!",
                "Não deixe que seu dia-a-dia seja comum, transforme-o em algo grandioso!",
                "O dia mal começou e eu já sinto uma vontade danada de ser feliz o tempo inteiro…\n",
                "Um sorriso significa muito. Enriquece quem o recebe, sem empobrecer quem o oferece. Dura apenas um segundo, mas a sua recordação, por vezes, nunca se apaga.",
                "Que hoje seja um dia marcado por conquistas e vitórias para a glória de Deus.",
                "O êxito na vida não se mede pelo que você conquistou, mas sim pelas dificuldades que superou no caminho.",
                "Existem coisas que precisam ser lembradas para que não sejam esquecidas, mas tem coisas que são impossíveis de esquecer: você. Tenha um bom dia meu amor!",
                "Como borboletas que seguem em direção à luz, que cada um de nós saiba abandonar os antigos casulos e voe em direção ao brilho da vida que está começando agora. ",
                "Somente quem vê a mão de Deus em todas as coisas pode colocar todas as coisas em suas mãos.",
                "A felicidade é um bem que se multiplica ao ser dividido.",
                "Que Deus nosso Pai abençoe ricamente o seu dia. Que Ele faça chover bênçãos de saúde, alegria, felicidade e harmonia sobre você e sua linda família!",
                "Sorria! Deus acaba de te dar um novo dia e coisas extraordinárias podem acontecer se você crer!",
        "Comece o dia fazendo uma limpeza! Varra de seu coração: a tristeza, a angústia, a aflição… Varra de sua vida: a inveja, a maledicência, a fofoca… Varra do seu corpo: a preguiça, o tédio, os maus pensamentos, e tenha um bom dia!",
        "Nunca deixe que os momentos ruins sejam mais longos do que os felizes. Viva o hoje, faça o que gosta e esteja ao lado de quem ama. ",
        "É bom sonhar, mas é melhor sonhar e trabalhar. A fé é poderosa, mas a ação com fé é mais poderosa ainda.",
        " Cada dia que vivemos é um novo presente de Deus e a melhor maneira de agradecê-lo é viver sempre com muita alegria.",
        "Cada nova manhã é uma nova oportunidade que temos de estar com quem amamos.",
        "Hoje certamente, tudo dará certo, o seu caminho será suavizado pela brisa do ar, que chegará até você de mansinho, trazendo com ela o aroma das flores, que darão colorido ao seu dia.",
        "Olá! Desejo que a sua vida seja sempre repleta de momentos felizes. Tenha um excelente dia!",
        "Tenha um abençoado dia! Que a felicidade permaneça com você em todos os minutos desse dia.",
        "Existem manhãs em que abrimos a janela, e temos a impressão de que o dia está nos esperando.\n" +
                "Charles Baudelaire",
        "Se alguém está tão cansado que não possa te dar um sorriso, deixa-lhe o teu. Que o seu dia seja repleto de belos sorrisos.",
        "Ontem foi embora. Amanhã ainda não veio. Temos somente hoje, comecemos! Qualquer ato de amor, por menor que seja, é um trabalho pela paz.\n" +
                "Madre Teresa de Calcutá",
        "A angústia de ter perdido não supera a alegria de se ter um novo dia para tentar de novo. Um bom dia pra você!",
        "A cada manhã o mundo é novo para mim.\n" +
                "Sidonie Colette",
        "Um dia quando olhares para trás verás que os dias mais belos foram aqueles em que lutaste. Lindo dia para você!",
        "Se exagerássemos em nossas alegrias como fazemos em nossas perdas, nossos problemas perderiam toda sua importância. Exagere nas alegrias e tenha um belo dia.",
        "Faça a dieta da alegria: um sorriso a cada manhã. Um agradecimento ao final do dia.",
        "Mantenha o foco no objetivo, centralize a força para lutar e utilize a fé para vencer.",
        "Tenha esperanças no amanhã. Saiba que após a noite vem um novo dia.",
        "Sabe aquele dia especial, cheio de surpresas boas, recheado de alegrias e repleto de bênçãos? Então, é assim que eu desejo para você. Bom dia!",
        "Uma alegria compartilhada transforma-se numa dupla alegria. Uma tristeza compartilhada em meia tristeza. Que você tenha um excelente dia!",
        "Mesmo caminhando entre espinhos e com muitas pedras nos caminhos continue caminhando com coragem e confie no poder Daquele que é maior. Tenha um maravilhoso dia!",
        "Que seja belo e doce teu despertar… Que nele encontre todas as coisas bonitas desta vida… O canto dos pássaros, o perfume das flores, o sorriso de uma criança, a pureza de um olhar, o calor de um amor…",
        "A vida é curta, aproveite-a. O amor é raro, agarre-o. A raiva é ruim, jogue-a fora. O medo é ridículo, enfrente-o. Memórias são doces, saboreie-as.",
        "Seja você quem for, onde estiver, com o material que tiver à sua disposição, o sucesso e a grandeza estarão sempre esperando que você os faça acontecer.",
        "Gostar do que se faz e sentir que é importante, existe algo mais divertido?",
        "Sorria, estou desejando à você um excelente dia. Muita paz, muita alegria, um dia super feliz!",
        "A beleza está em toda parte e talvez em cada momento de nossas vidas. Olhe bem a sua volta e não perca mesmo nos mínimos detalhes, a beleza que Deus nos dá diariamente.",
        "Os homens fariam maiores coisas, se não julgassem tantas coisas impossíveis.",
        "O dia está alegre! E eu também, por desejar mais um perfeito dia para você.",
        " Que os ares deste novo dia sejam para você repletos de alegria!",
        "Comece o seu dia com louvor e agradecimentos, pois a bondade de Deus se renova a cada manhã.",
        "Sente-se a beira do amanhecer, o sol nascerá para você. Sente-se a beira do riacho, o rouxinol cantará para você. Sente-se a beira do silêncio… Deus falará com você.",
        "Não são as coisas bonitas que marcam nossas vidas, mas sim as pessoas que tem o dom de jamais serem esquecidas!",
        "Meu Deus, coloco esta semana em Tuas mãos… Guia-me em tudo que eu for fazer e estejas a minha frente mostrando o caminho que devo seguir!",
        "Essa manhã Deus me disse para crer, esperar e descansar. Porque vai dar tudo certo. ",
        "O trabalho é o grande libertador do homem. Só a ociosidade o escraviza.",
        "Eu não poderia deixar de passar por aqui, para desejar com todo meu carinho, que você tenha um ótimo dia.",
        "Que a cada manhã, você sinta em seu coração a certeza de que a vida lhe espera de braços abertos, para receber suas expectativas e realizá-las uma a uma."};

        int numero = new Random().nextInt(frases.length);
        TextView texto = (TextView) findViewById(R.id.text_resultado);
        texto.setText(frases[numero]);
    }
}