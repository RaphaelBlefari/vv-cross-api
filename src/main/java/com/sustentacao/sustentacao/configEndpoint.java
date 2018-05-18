package com.sustentacao.sustentacao;

import com.sustentacao.sustentacao.model.MpComponente;
import com.sustentacao.sustentacao.model.MpCross;
import com.sustentacao.sustentacao.model.MyKey;
import com.sustentacao.sustentacao.repository.MpComponenteRepository;
import com.sustentacao.sustentacao.repository.MpCrossRepository;
import jdk.nashorn.internal.runtime.regexp.joni.Regex;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.web.bind.annotation.*;

import java.io.*;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
public class configEndpoint {


    @Autowired
    private MpComponenteRepository mpcomponentRepo;

    @Autowired
    private MpCrossRepository mpcrossRepo;

    @RequestMapping(value = "/config/vv-carrinho/local", method = RequestMethod.GET, produces = "application/json")
    public String RetornaConfig() {
        return "{'name':'vv-carrinho','profiles':['local'],'label':null,'version':'4436f198e080a1acfb795c164a815eacac658155','state':null,'propertySources':[{'name':'http://bitbucket.viavarejo.com.br/scm/lfaj/vv-configuracao.git/vv-carrinho/vv-carrinho.yml#local','source':{'spring.profiles':'local','spring.redis.host':'redis.server','spring.redis.port':6379,'spring.data.mongodb.host':'mongo.server','spring.data.mongodb.port':27017,'spring.data.mongodb.database':'carrinho','spring.data.mongodb.repositories.enabled':true,'spring.datasource.url':'jdbc:db2://s0000va:50000/DBHMVS','spring.datasource.driver-class-name':'com.ibm.db2.jcc.DB2Driver','spring.datasource.username':'PRNSV','spring.datasource.password':'hom@nsve','spring.datasource.tomcat.initial-size':1,'spring.datasource.tomcat.max-active':2,'signing.key':'vi@v@r3joHom2018','db2.schema':'HMLBAT.','atendimento.url':'http://application.server/vv-atendimento','catalogo.url':'http://application.server/vv-catalogo','crm.url':'http://application.server/vv-crm','desconto.url':'http://application.server/vv-desconto','catalogo-servicos.url':'http://application.server/vv-catalogo-servicos','crediario.url':'http://application.server/vv-crediario','condicao-pagamento.url':'http://application.server/vv-condicao-pagamento','cics.serverName':'CICSHM2','cics.protocolo':'tcp','cics.porta':2006,'cics.host':'cics.server','security.enabled':false,'eureka.client.enabled':false}},{'name':'http://bitbucket.viavarejo.com.br/scm/lfaj/vv-configuracao.git/vv-carrinho/vv-carrinho.yml','source':{'spring.profiles.active':'local','server.port':8083,'management.security.enabled':false}},{'name':'http://bitbucket.viavarejo.com.br/scm/lfaj/vv-configuracao.git/application.yml','source':{'logging.level.org.springframework.security':'ERROR','logging.level.org.springframework.boot.diagnostics.LoggingFailureAnalysisReporter':'ERROR','logging.level.org.hibernate.type':'ERROR','logging.level.br.com.viavarejo.cicscc.dao':'ERROR','hystrix.command.default.execution.isolation.thread.timeoutInMilliseconds':60000}}]}".replace("'", "\"");
    }

    @RequestMapping(value = "/config", method = RequestMethod.GET, produces = "application/json")
    public String RetornaConfig2() {
        return "{'name':'vv-zuulserver','profiles':['dev'],'label':null,'version':'4436f198e080a1acfb795c164a815eacac658155','state':null,'propertySources':[{'name':'http://bitbucket.viavarejo.com.br/scm/lfaj/vv-configuracao.git/vv-zuulserver/vv-zuulserver.yml#dev','source':{'spring.profiles':'dev','signing.key':'vi@v@r3joDev2018','zuul.ignored-headers':'Access-Control-Allow-Credentials, Access-Control-Allow-Origin,Access-Control-Expose-Headers,Vary','zuul.routes.vv-atendimento.path':'/vv-atendimento/**','zuul.routes.vv-atendimento.url':'http://application.server:8082/','zuul.routes.vv-carrinho.path':'/vv-carrinho/**','zuul.routes.vv-carrinho.url':'http://application.server:8083/','zuul.routes.vv-crm.path':'/vv-crm/**','zuul.routes.vv-crm.url':'http://application.server:8084/','zuul.routes.vv-catalogo.url':'http://application.server:8088/','zuul.routes.vv-adm.url':'http://application.server:8095/','zuul.routes.vv-condicao-pagamento.url':'http://application.server:8086/','zuul.routes.vv-desconto.url':'http://application.server:8092/','zuul.routes.vv-lista-casamento.url':'http://application.server:8097/','zuul.routes.vv-autorizacao.path':'/uaa/**','zuul.routes.vv-autorizacao.url':'http://application.server:8901/','zuul.routes.vv-catalogo-servicos.url':'http://application.server:8087/','zuul.routes.vv-crediario.url':'http://application.server:8089/','zuul.routes.vv-crediario-biometria.url':'http://application.server:8090/','zuul.routes.vv-farol.url':'http://application.server:8098/','zuul.host.connect-timeout-millis':120000,'zuul.host.socket-timeout-millis':120000,'zuul.ignored-services':'*','zuul.sensitive-headers':'Cookie, Set-Cookie'}},{'name':'http://bitbucket.viavarejo.com.br/scm/lfaj/vv-configuracao.git/vv-zuulserver/vv-zuulserver.yml','source':{'spring.profiles.active':'local','server.port':5555,'management.security.enabled':false,'vv-autorizacao.ribbon.ReadTimeout':120000,'vv-atendimento.ribbon.ReadTimeout':120000,'vv-carrinho.ribbon.ReadTimeout':120000,'vv-catalogo.ribbon.ReadTimeout':120000,'vv-crm.ribbon.ReadTimeout':120000,'vv-lista-casamento.ribbon.ReadTimeout':120000,'vv-catalogo-servicos.ribbon.ReadTimeout':120000,'vv-crediario.ribbon.ReadTimeout':120000,'vv-crediario-biometria.ribbon.ReadTimeout':120000,'vv-farol.ribbon.ReadTimeout':120000,'ribbon.ConnectTimeout':3000,'ribbon.ReadTimeout':60000}},{'name':'http://bitbucket.viavarejo.com.br/scm/lfaj/vv-configuracao.git/application.yml','source':{'logging.level.org.springframework.security':'ERROR','logging.level.org.springframework.boot.diagnostics.LoggingFailureAnalysisReporter':'ERROR','logging.level.org.hibernate.type':'ERROR','logging.level.br.com.viavarejo.cicscc.dao':'ERROR','hystrix.command.default.execution.isolation.thread.timeoutInMilliseconds':60000}}]}".replace("'", "\"");
    }

    @RequestMapping(value = "/retornafilho", method = RequestMethod.GET,produces = "application/json")
    public Iterable<MpCross> RetornaFilho(@RequestParam("idpai") String idpai) {
    Iterable<MpCross> lst = mpcrossRepo.findAll();
        List<MpCross> lstreal = new ArrayList<>();

        for (MpCross mp: lst) {
        if(mp.getMyKey().getCpNome().equalsIgnoreCase(idpai))
            lstreal.add(mp);
        }

        return lstreal;
    }

    @RequestMapping(value = "/testeleitura", method = RequestMethod.GET)
    public String TestaLeitura(@RequestParam("busca") String busca) {

        File folder = new File("C://cobol/VN - Integrador");
        File[] listOfFiles = folder.listFiles();
        List<String> list = new ArrayList<String>();
        List<MpComponente> lstMpComponente = new ArrayList<>();
        MpComponente mpcomponente = new MpComponente();
        BufferedReader reader = null;
        StringBuilder str = new StringBuilder();

        for (File teste : listOfFiles) {
            try {
                reader = new BufferedReader(new FileReader(teste));
                String text = null;
                while ((text = reader.readLine()) != null) {

                    Matcher m = Pattern.compile("MOVE(.*\\s)TO WK-LKPROGRAM")
                            .matcher(text);

                    while (m.find()) {

                        String pai = teste.getName();
                        String filho =  m.group(1);
                        filho = filho.replace("MOVE ","");
                        filho = filho.replace("TO WK-LKPROGRAM.","");
                        filho = filho.replace("TO WK-LKPROGRAM","");
                        filho = filho.replace("'","");
                        filho = filho.replace(".","");
                        filho = filho.replace("*","");
                        filho = filho.replace("\"","");
                        filho = filho.trim();

                        if(pai.equalsIgnoreCase("VNPI0128.cbl")){
                            int x = 1;
                        }

                        str.append("Pai > "+teste.getName()+" Filho > "+filho+"  <br>");

                        MpCross mp = new MpCross();
                        MyKey mkey = new MyKey();
                        mkey.setCpNome(pai);
                        mkey.setCrNome(filho);
                        mp.setMyKey(mkey);
                        mpcrossRepo.save(mp);

                        list.add(m.group());
                    }
                }
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            } catch (IOException e) {
                e.printStackTrace();
            } finally {
                try {
                    if (reader != null) {
                        reader.close();
                    }
                } catch (IOException e) {
                }
            }
        }

        return str.toString();
    }


    @RequestMapping(value = "/teste", method = RequestMethod.GET, produces = "application/json")
    public Iterable<MpComponente> TestaRepository(@RequestParam("busca") String busca) {
        //this.LeArquivos();
        return mpcomponentRepo.findBycpNomeIgnoreCaseContaining(busca);
    }

    @RequestMapping(value = "/vvcross", method = RequestMethod.GET, produces = "application/json")
    public MpCross vvcross() {
        MpCross mp = new MpCross();
        MyKey mkey = new MyKey();
        mkey.setCpNome("aaa");
        mkey.setCrNome("bbbb");
        mp.setMyKey(mkey);
        mpcrossRepo.save(mp);
        return mp;
    }


    @RequestMapping(value = "/listapai", method = RequestMethod.GET, produces = "application/json")
    public List<MpComponente> LeArquivos() {
        File folder = new File("C://cobol/VN - Integrador");
        File[] listOfFiles = folder.listFiles();

        List<MpComponente> lstMpComponente = new ArrayList<>();
        MpComponente mpcomponente = new MpComponente();

        for (File    teste : listOfFiles) {
            if(teste.isFile()) {
                teste.toString();

                mpcomponente = new MpComponente();
                Date data = new java.util.Date();
                mpcomponente.setCpNome(teste.getName());
                mpcomponente.setCpDtAlteracao(data);
                mpcomponente.setCpDtInclusao(data);
                mpcomponente.setCpLocal(1);
                mpcomponente.setDmCodigo(1);
                mpcomponente.setCpSiglaSis(teste.getName().substring(0, 4));
                mpcomponente.setCpFuncao("Programa que realiza o ???");
                lstMpComponente.add(mpcomponente);
            }
        }

        mpcomponentRepo.saveAll(lstMpComponente);

        return lstMpComponente;
    }
}
