package sun.security.tools.keytool;

import java.util.ListResourceBundle;

public class Resources_pt_BR extends ListResourceBundle {
  private static final Object[][] contents = { 
      { "NEWLINE", "\n" }, { "STAR", "*******************************************" }, { "STARNN", "*******************************************\n\n" }, { ".OPTION.", " [OPTION]..." }, { "Options.", "Opções:" }, { "Use.keytool.help.for.all.available.commands", "Use \"keytool -help\" para todos os comandos disponíveis" }, { "Key.and.Certificate.Management.Tool", "Ferramenta de Gerenciamento de Chave e Certificado" }, { "Commands.", "Comandos:" }, { "Use.keytool.command.name.help.for.usage.of.command.name", "Use \"keytool -command_name -help\" para uso de command_name" }, { "Generates.a.certificate.request", "Gera uma solicitação de certificado" }, 
      { "Changes.an.entry.s.alias", "Altera um alias de entrada" }, { "Deletes.an.entry", "Exclui uma entrada" }, { "Exports.certificate", "Exporta o certificado" }, { "Generates.a.key.pair", "Gera um par de chaves" }, { "Generates.a.secret.key", "Gera uma chave secreta" }, { "Generates.certificate.from.a.certificate.request", "Gera um certificado de uma solicitação de certificado" }, { "Generates.CRL", "Gera CRL" }, { "Generated.keyAlgName.secret.key", "Chave secreta {0} gerada" }, { "Generated.keysize.bit.keyAlgName.secret.key", "Chave secreta {1} de {0} bits gerada" }, { "Imports.entries.from.a.JDK.1.1.x.style.identity.database", "Importa entradas de um banco de dados de identidade JDK 1.1.x-style" }, 
      { "Imports.a.certificate.or.a.certificate.chain", "Importa um certificado ou uma cadeia de certificados" }, { "Imports.a.password", "Importa uma senha" }, { "Imports.one.or.all.entries.from.another.keystore", "Importa uma ou todas as entradas de outra área de armazenamento de chaves" }, { "Clones.a.key.entry", "Clona uma entrada de chave" }, { "Changes.the.key.password.of.an.entry", "Altera a senha da chave de uma entrada" }, { "Lists.entries.in.a.keystore", "Lista entradas em uma área de armazenamento de chaves" }, { "Prints.the.content.of.a.certificate", "Imprime o conteúdo de um certificado" }, { "Prints.the.content.of.a.certificate.request", "Imprime o conteúdo de uma solicitação de certificado" }, { "Prints.the.content.of.a.CRL.file", "Imprime o conteúdo de um arquivo CRL" }, { "Generates.a.self.signed.certificate", "Gera um certificado autoassinado" }, 
      { "Changes.the.store.password.of.a.keystore", "Altera a senha de armazenamento de uma área de armazenamento de chaves" }, { "alias.name.of.the.entry.to.process", "nome do alias da entrada a ser processada" }, { "destination.alias", "alias de destino" }, { "destination.key.password", "senha da chave de destino" }, { "destination.keystore.name", "nome da área de armazenamento de chaves de destino" }, { "destination.keystore.password.protected", "senha protegida da área de armazenamento de chaves de destino" }, { "destination.keystore.provider.name", "nome do fornecedor da área de armazenamento de chaves de destino" }, { "destination.keystore.password", "senha da área de armazenamento de chaves de destino" }, { "destination.keystore.type", "tipo de área de armazenamento de chaves de destino" }, { "distinguished.name", "nome distinto" }, 
      { "X.509.extension", "extensão X.509" }, { "output.file.name", "nome do arquivo de saída" }, { "input.file.name", "nome do arquivo de entrada" }, { "key.algorithm.name", "nome do algoritmo da chave" }, { "key.password", "senha da chave" }, { "key.bit.size", "tamanho do bit da chave" }, { "keystore.name", "nome da área de armazenamento de chaves" }, { "new.password", "nova senha" }, { "do.not.prompt", "não perguntar" }, { "password.through.protected.mechanism", "senha por meio de mecanismo protegido" }, 
      { "provider.argument", "argumento do fornecedor" }, { "provider.class.name", "nome da classe do fornecedor" }, { "provider.name", "nome do fornecedor" }, { "provider.classpath", "classpath do fornecedor" }, { "output.in.RFC.style", "saída no estilo RFC" }, { "signature.algorithm.name", "nome do algoritmo de assinatura" }, { "source.alias", "alias de origem" }, { "source.key.password", "senha da chave de origem" }, { "source.keystore.name", "nome da área de armazenamento de chaves de origem" }, { "source.keystore.password.protected", "senha protegida da área de armazenamento de chaves de origem" }, 
      { "source.keystore.provider.name", "nome do fornecedor da área de armazenamento de chaves de origem" }, { "source.keystore.password", "senha da área de armazenamento de chaves de origem" }, { "source.keystore.type", "tipo de área de armazenamento de chaves de origem" }, { "SSL.server.host.and.port", "porta e host do servidor SSL" }, { "signed.jar.file", "arquivo jar assinado" }, { "certificate.validity.start.date.time", "data/hora inicial de validade do certificado" }, { "keystore.password", "senha da área de armazenamento de chaves" }, { "keystore.type", "tipo de área de armazenamento de chaves" }, { "trust.certificates.from.cacerts", "certificados confiáveis do cacerts" }, { "verbose.output", "saída detalhada" }, 
      { "validity.number.of.days", "número de dias da validade" }, { "Serial.ID.of.cert.to.revoke", "ID de série do certificado a ser revogado" }, { "keytool.error.", "erro de keytool: " }, { "Illegal.option.", "Opção inválida:  " }, { "Illegal.value.", "Valor inválido: " }, { "Unknown.password.type.", "Tipo de senha desconhecido: " }, { "Cannot.find.environment.variable.", "Não é possível localizar a variável do ambiente: " }, { "Cannot.find.file.", "Não é possível localizar o arquivo: " }, { "Command.option.flag.needs.an.argument.", "A opção de comando {0} precisa de um argumento." }, { "Warning.Different.store.and.key.passwords.not.supported.for.PKCS12.KeyStores.Ignoring.user.specified.command.value.", "Advertência: Senhas de chave e de armazenamento diferentes não suportadas para KeyStores PKCS12. Ignorando valor {0} especificado pelo usuário." }, 
      { ".keystore.must.be.NONE.if.storetype.is.{0}", "-keystore deve ser NONE se -storetype for {0}" }, { "Too.many.retries.program.terminated", "Excesso de tentativas de repetição; programa finalizado" }, { ".storepasswd.and.keypasswd.commands.not.supported.if.storetype.is.{0}", "comandos -storepasswd e -keypasswd não suportados se -storetype for {0}" }, { ".keypasswd.commands.not.supported.if.storetype.is.PKCS12", "comandos -keypasswd não suportados se -storetype for PKCS12" }, { ".keypass.and.new.can.not.be.specified.if.storetype.is.{0}", "-keypass e -new não podem ser especificados se -storetype for {0}" }, { "if.protected.is.specified.then.storepass.keypass.and.new.must.not.be.specified", "se -protected for especificado, então -storepass, -keypass e -new não deverão ser especificados" }, { "if.srcprotected.is.specified.then.srcstorepass.and.srckeypass.must.not.be.specified", "se -srcprotected for especificado, então -srcstorepass e -srckeypass não deverão ser especificados" }, { "if.keystore.is.not.password.protected.then.storepass.keypass.and.new.must.not.be.specified", "se a área de armazenamento de chaves não estiver protegida por senha, então -storepass, -keypass e -new não deverão ser especificados" }, { "if.source.keystore.is.not.password.protected.then.srcstorepass.and.srckeypass.must.not.be.specified", "se a área de armazenamento de chaves de origem não estiver protegida por senha, então -srcstorepass e -srckeypass não deverão ser especificados" }, { "Illegal.startdate.value", "valor da data inicial inválido" }, 
      { "Validity.must.be.greater.than.zero", "A validade deve ser maior do que zero" }, { "provName.not.a.provider", "{0} não é um fornecedor" }, { "Usage.error.no.command.provided", "Erro de uso: nenhum comando fornecido" }, { "Source.keystore.file.exists.but.is.empty.", "O arquivo da área de armazenamento de chaves de origem existe, mas está vazio: " }, { "Please.specify.srckeystore", "Especifique -srckeystore" }, { "Must.not.specify.both.v.and.rfc.with.list.command", "Não devem ser especificados -v e -rfc com o comando 'list'" }, { "Key.password.must.be.at.least.6.characters", "A senha da chave deve ter, no mínimo, 6 caracteres" }, { "New.password.must.be.at.least.6.characters", "A nova senha deve ter, no mínimo, 6 caracteres" }, { "Keystore.file.exists.but.is.empty.", "O arquivo da área de armazenamento de chaves existe, mas está vazio: " }, { "Keystore.file.does.not.exist.", "O arquivo da área de armazenamento de chaves não existe. " }, 
      { "Must.specify.destination.alias", "Deve ser especificado um alias de destino" }, { "Must.specify.alias", "Deve ser especificado um alias" }, { "Keystore.password.must.be.at.least.6.characters", "A senha da área de armazenamento de chaves deve ter, no mínimo, 6 caracteres" }, { "Enter.the.password.to.be.stored.", "Digite a senha a ser armazenada:  " }, { "Enter.keystore.password.", "Informe a senha da área de armazenamento de chaves:  " }, { "Enter.source.keystore.password.", "Informe a senha da área de armazenamento de chaves de origem:  " }, { "Enter.destination.keystore.password.", "Informe a senha da área de armazenamento de chaves de destino:  " }, { "Keystore.password.is.too.short.must.be.at.least.6.characters", "A senha da área de armazenamento de chaves é muito curta - ela deve ter, no mínimo, 6 caracteres" }, { "Unknown.Entry.Type", "Tipo de Entrada Desconhecido" }, { "Too.many.failures.Alias.not.changed", "Excesso de falhas. Alias não alterado" }, 
      { "Entry.for.alias.alias.successfully.imported.", "Entrada do alias {0} importada com êxito." }, { "Entry.for.alias.alias.not.imported.", "Entrada do alias {0} não importada." }, { "Problem.importing.entry.for.alias.alias.exception.Entry.for.alias.alias.not.imported.", "Problema ao importar a entrada do alias {0}: {1}.\nEntrada do alias {0} não importada." }, { "Import.command.completed.ok.entries.successfully.imported.fail.entries.failed.or.cancelled", "Comando de importação concluído:  {0} entradas importadas com êxito, {1} entradas falharam ou foram canceladas" }, { "Warning.Overwriting.existing.alias.alias.in.destination.keystore", "Advertência: Substituição do alias {0} existente na área de armazenamento de chaves de destino" }, { "Existing.entry.alias.alias.exists.overwrite.no.", "Entrada já existente no alias {0}, substituir? [não]:  " }, { "Too.many.failures.try.later", "Excesso de falhas - tente mais tarde" }, { "Certification.request.stored.in.file.filename.", "Solicitação de certificado armazenada no arquivo <{0}>" }, { "Submit.this.to.your.CA", "Submeter à CA" }, { "if.alias.not.specified.destalias.and.srckeypass.must.not.be.specified", "se o alias não estiver especificado, destalias e srckeypass não deverão ser especificados" }, 
      { "The.destination.pkcs12.keystore.has.different.storepass.and.keypass.Please.retry.with.destkeypass.specified.", "O armazenamento de chaves pkcs12 de destino tem storepass e keypass diferentes. Tente novamente especificando -destkeypass." }, { "Certificate.stored.in.file.filename.", "Certificado armazenado no arquivo <{0}>" }, { "Certificate.reply.was.installed.in.keystore", "A resposta do certificado foi instalada na área de armazenamento de chaves" }, { "Certificate.reply.was.not.installed.in.keystore", "A resposta do certificado não foi instalada na área de armazenamento de chaves" }, { "Certificate.was.added.to.keystore", "O certificado foi adicionado à área de armazenamento de chaves" }, { "Certificate.was.not.added.to.keystore", "O certificado não foi adicionado à área de armazenamento de chaves" }, { ".Storing.ksfname.", "[Armazenando {0}]" }, { "alias.has.no.public.key.certificate.", "{0} não tem chave pública (certificado)" }, { "Cannot.derive.signature.algorithm", "Não é possível obter um algoritmo de assinatura" }, { "Alias.alias.does.not.exist", "O alias <{0}> não existe" }, 
      { "Alias.alias.has.no.certificate", "O alias <{0}> não tem certificado" }, { "Key.pair.not.generated.alias.alias.already.exists", "Par de chaves não gerado; o alias <{0}> já existe" }, { "Generating.keysize.bit.keyAlgName.key.pair.and.self.signed.certificate.sigAlgName.with.a.validity.of.validality.days.for", "Gerando o par de chaves {1} de {0} bit e o certificado autoassinado ({2}) com uma validade de {3} dias\n\tpara: {4}" }, { "Enter.key.password.for.alias.", "Informar a senha da chave de <{0}>" }, { ".RETURN.if.same.as.keystore.password.", "\t(RETURN se for igual à senha da área do armazenamento de chaves):  " }, { "Key.password.is.too.short.must.be.at.least.6.characters", "A senha da chave é muito curta - deve ter, no mínimo, 6 caracteres" }, { "Too.many.failures.key.not.added.to.keystore", "Excesso de falhas - chave não adicionada a área de armazenamento de chaves" }, { "Destination.alias.dest.already.exists", "O alias de destino <{0}> já existe" }, { "Password.is.too.short.must.be.at.least.6.characters", "A senha é muito curta - deve ter, no mínimo, 6 caracteres" }, { "Too.many.failures.Key.entry.not.cloned", "Excesso de falhas. Entrada da chave não clonada" }, 
      { "key.password.for.alias.", "senha da chave de <{0}>" }, { "Keystore.entry.for.id.getName.already.exists", "A entrada da área do armazenamento de chaves de <{0}> já existe" }, { "Creating.keystore.entry.for.id.getName.", "Criando entrada da área do armazenamento de chaves para <{0}> ..." }, { "No.entries.from.identity.database.added", "Nenhuma entrada adicionada do banco de dados de identidades" }, { "Alias.name.alias", "Nome do alias: {0}" }, { "Creation.date.keyStore.getCreationDate.alias.", "Data de criação: {0,date}" }, { "alias.keyStore.getCreationDate.alias.", "{0}, {1,date}, " }, { "alias.", "{0}, " }, { "Entry.type.type.", "Tipo de entrada: {0}" }, { "Certificate.chain.length.", "Comprimento da cadeia de certificados: " }, 
      { "Certificate.i.1.", "Certificado[{0,number,integer}]:" }, { "Certificate.fingerprint.SHA1.", "Fingerprint (SHA1) do certificado: " }, { "Keystore.type.", "Tipo de área de armazenamento de chaves: " }, { "Keystore.provider.", "Fornecedor da área de armazenamento de chaves: " }, { "Your.keystore.contains.keyStore.size.entry", "Sua área de armazenamento de chaves contém {0,number,integer} entrada" }, { "Your.keystore.contains.keyStore.size.entries", "Sua área de armazenamento de chaves contém {0,number,integer} entradas" }, { "Failed.to.parse.input", "Falha durante o parsing da entrada" }, { "Empty.input", "Entrada vazia" }, { "Not.X.509.certificate", "Não é um certificado X.509" }, { "alias.has.no.public.key", "{0} não tem chave pública" }, 
      { "alias.has.no.X.509.certificate", "{0} não tem certificado X.509" }, { "New.certificate.self.signed.", "Novo certificado (autoassinado):" }, { "Reply.has.no.certificates", "A resposta não tem certificado" }, { "Certificate.not.imported.alias.alias.already.exists", "Certificado não importado, o alias <{0}> já existe" }, { "Input.not.an.X.509.certificate", "A entrada não é um certificado X.509" }, { "Certificate.already.exists.in.keystore.under.alias.trustalias.", "O certificado já existe no armazenamento de chaves no alias <{0}>" }, { "Do.you.still.want.to.add.it.no.", "Ainda deseja adicioná-lo? [não]:  " }, { "Certificate.already.exists.in.system.wide.CA.keystore.under.alias.trustalias.", "O certificado já existe na área de armazenamento de chaves da CA em todo o sistema no alias <{0}>" }, { "Do.you.still.want.to.add.it.to.your.own.keystore.no.", "Ainda deseja adicioná-lo à sua área de armazenamento de chaves? [não]:  " }, { "Trust.this.certificate.no.", "Confiar neste certificado? [não]:  " }, 
      { "YES", "SIM" }, { "New.prompt.", "Nova {0}: " }, { "Passwords.must.differ", "As senhas devem ser diferentes" }, { "Re.enter.new.prompt.", "Informe novamente a nova {0}: " }, { "Re.enter.password.", "Redigite a senha: " }, { "Re.enter.new.password.", "Informe novamente a nova senha: " }, { "They.don.t.match.Try.again", "Elas não correspondem. Tente novamente" }, { "Enter.prompt.alias.name.", "Informe o nome do alias {0}:  " }, { "Enter.new.alias.name.RETURN.to.cancel.import.for.this.entry.", "Informe o novo nome do alias\t(RETURN para cancelar a importação desta entrada):  " }, { "Enter.alias.name.", "Informe o nome do alias:  " }, 
      { ".RETURN.if.same.as.for.otherAlias.", "\t(RETURN se for igual ao de <{0}>)" }, { "What.is.your.first.and.last.name.", "Qual é o seu nome e o seu sobrenome?" }, { "What.is.the.name.of.your.organizational.unit.", "Qual é o nome da sua unidade organizacional?" }, { "What.is.the.name.of.your.organization.", "Qual é o nome da sua empresa?" }, { "What.is.the.name.of.your.City.or.Locality.", "Qual é o nome da sua Cidade ou Localidade?" }, { "What.is.the.name.of.your.State.or.Province.", "Qual é o nome do seu Estado ou Município?" }, { "What.is.the.two.letter.country.code.for.this.unit.", "Quais são as duas letras do código do país desta unidade?" }, { "Is.name.correct.", "{0} Está correto?" }, { "no", "não" }, { "yes", "sim" }, 
      { "y", "s" }, { ".defaultValue.", "  [{0}]:  " }, { "Alias.alias.has.no.key", "O alias <{0}> não tem chave" }, { "Alias.alias.references.an.entry.type.that.is.not.a.private.key.entry.The.keyclone.command.only.supports.cloning.of.private.key", "O alias <{0}> faz referência a um tipo de entrada que não é uma entrada de chave privada. O comando -keyclone oferece suporte somente à clonagem de entradas de chave privada" }, { ".WARNING.WARNING.WARNING.", "*****************  WARNING WARNING WARNING  *****************" }, { "Signer.d.", "Signatário #%d:" }, { "Timestamp.", "Timestamp:" }, { "Signature.", "Assinatura:" }, { "CRLs.", "CRLs:" }, { "Certificate.owner.", "Proprietário do certificado: " }, 
      { "Not.a.signed.jar.file", "Não é um arquivo jar assinado" }, { "No.certificate.from.the.SSL.server", "Não é um certificado do servidor SSL" }, { ".The.integrity.of.the.information.stored.in.your.keystore.", "* A integridade das informações armazenadas na sua área de armazenamento de chaves  *\n* NÃO foi verificada!  Para que seja possível verificar sua integridade, *\n* você deve fornecer a senha da área de armazenamento de chaves.                  *" }, { ".The.integrity.of.the.information.stored.in.the.srckeystore.", "* A integridade das informações armazenadas no srckeystore  *\n* NÃO foi verificada!  Para que seja possível verificar sua integridade, *\n* você deve fornecer a senha do srckeystore.                  *" }, { "Certificate.reply.does.not.contain.public.key.for.alias.", "A resposta do certificado não contém a chave pública de <{0}>" }, { "Incomplete.certificate.chain.in.reply", "Cadeia de certificados incompleta na resposta" }, { "Certificate.chain.in.reply.does.not.verify.", "A cadeia de certificados da resposta não verifica: " }, { "Top.level.certificate.in.reply.", "Certificado de nível superior na resposta:\n" }, { ".is.not.trusted.", "... não é confiável. " }, { "Install.reply.anyway.no.", "Instalar resposta assim mesmo? [não]:  " }, 
      { "NO", "NÃO" }, { "Public.keys.in.reply.and.keystore.don.t.match", "As chaves públicas da resposta e da área de armazenamento de chaves não correspondem" }, { "Certificate.reply.and.certificate.in.keystore.are.identical", "O certificado da resposta e o certificado da área de armazenamento de chaves são idênticos" }, { "Failed.to.establish.chain.from.reply", "Falha ao estabelecer a cadeia a partir da resposta" }, { "n", "n" }, { "Wrong.answer.try.again", "Resposta errada; tente novamente" }, { "Secret.key.not.generated.alias.alias.already.exists", "Chave secreta não gerada; o alias <{0}> já existe" }, { "Please.provide.keysize.for.secret.key.generation", "Forneça o -keysize para a geração da chave secreta" }, { "warning.not.verified.make.sure.keystore.is.correct", "ADVERTÊNCIA: não verificado. Certifique-se que -keystore esteja correto." }, { "Extensions.", "Extensões: " }, 
      { ".Empty.value.", "(Valor vazio)" }, { "Extension.Request.", "Solicitação de Extensão:" }, { "Unknown.keyUsage.type.", "Tipo de keyUsage desconhecido: " }, { "Unknown.extendedkeyUsage.type.", "Tipo de extendedkeyUsage desconhecido: " }, { "Unknown.AccessDescription.type.", "Tipo de AccessDescription desconhecido: " }, { "Unrecognized.GeneralName.type.", "Tipo de GeneralName não reconhecido: " }, { "This.extension.cannot.be.marked.as.critical.", "Esta extensão não pode ser marcada como crítica. " }, { "Odd.number.of.hex.digits.found.", "Encontrado número ímpar de seis dígitos: " }, { "Unknown.extension.type.", "Tipo de extensão desconhecido: " }, { "command.{0}.is.ambiguous.", "o comando {0} é ambíguo:" }, 
      { "the.certificate.request", "A solicitação do certificado" }, { "the.issuer", "O emissor" }, { "the.generated.certificate", "O certificado gerado" }, { "the.generated.crl", "A CRL gerada" }, { "the.generated.certificate.request", "A solicitação do certificado gerada" }, { "the.certificate", "O certificado" }, { "the.crl", "A CRL" }, { "the.tsa.certificate", "O certificado TSA" }, { "the.input", "A entrada" }, { "reply", "Resposta" }, 
      { "one.in.many", "%1$s #%2$d de %3$d" }, { "alias.in.cacerts", "Emissor <%s> no cacerts" }, { "alias.in.keystore", "Emissor <%s>" }, { "with.weak", "%s (fraca)" }, { "key.bit", "Chave %2$s de %1$d bits" }, { "key.bit.weak", "Chave %2$s de %1$d bits (fraca)" }, { ".PATTERN.printX509Cert.with.weak", "Proprietário: {0}\nEmissor: {1}\nNúmero de série: {2}\nVálido de {3} até {4}\nFingerprints do certificado:\n\t MD5:  {5}\n\t SHA1: {6}\n\t SHA256: {7}\nNome do algoritmo de assinatura: {8}\nAlgoritmo de Chave Pública do Assunto: {9}\nVersão: {10}" }, { "PKCS.10.with.weak", "Solicitação do Certificado PKCS #10 (Versão 1.0)\nAssunto: %1$s\nFormato: %2$s\nChave Pública: %3$s\nAlgoritmo de assinatura: %4$s\n" }, { "verified.by.s.in.s.weak", "Verificado por %1$s em %2$s com um %3$s" }, { "whose.sigalg.risk", "%1$s usa o algoritmo de assinatura %2$s que é considerado um risco à segurança." }, 
      { "whose.key.risk", "%1$s usa um %2$s que é considerado um risco à segurança." }, { "jks.storetype.warning", "O armazenamento de chaves %1$s usa um formato proprietário. É recomendada a migração para PKCS12, que é um formato de padrão industrial que usa \"keytool -importkeystore -srckeystore %2$s -destkeystore %2$s -deststoretype pkcs12\"." }, { "migrate.keystore.warning", "\"%1$s\" foi migrado para %4$s. O backup do armazenamento de chaves %2$s é feito como \"%3$s\"." }, { "backup.keystore.warning", "O backup do armazenamento de chaves original \"%1$s\" é feito como \"%3$s\"..." }, { "importing.keystore.status", "Importando armazenamento de chaves %1$s to %2$s..." } };
  
  public Object[][] getContents() { return contents; }
}


/* Location:              D:\software\jd-gui\jd-gui-windows-1.6.3\rt.jar!\sun\security\tools\keytool\Resources_pt_BR.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.0.7
 */