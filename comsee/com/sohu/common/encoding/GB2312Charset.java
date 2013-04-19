package com.sohu.common.encoding;

public class GB2312Charset {

	// 根据com.sohu.tools.FindAllGB2312Char打印出所有的GB2312以及fixup的常用字码表，作为判断依据
	public static final long[] charset = new long[]{

		0l, 0l, 0l, 0l, 0l, 0l, 0l, 0l, 
		0l, 0l, 0l, 0l, 0l, 0l, 0l, 0l, 
		0l, 0l, 0l, 0l, 0l, 0l, 0l, 0l, 
		0l, 0l, 0l, 0l, 0l, 0l, 0l, 0l, 
		0l, 0l, 0l, 0l, 0l, 0l, 0l, 0l, 
		0l, 0l, 0l, 0l, 0l, 0l, 0l, 0l, 
		0l, 0l, 0l, 0l, 0l, 0l, 0l, 0l, 
		0l, 0l, 0l, 0l, 0l, 0l, 0l, 0l, 
		0l, 0l, 0l, 0l, 0l, 0l, 0l, 0l, 
		0l, 0l, 0l, 0l, 0l, 0l, 0l, 0l, 
		0l, 0l, 0l, 0l, 0l, 0l, 0l, 0l, 
		0l, 0l, 0l, 0l, 0l, 0l, 0l, 0l, 
		0l, 0l, 0l, 0l, 0l, 0l, 0l, 0l, 
		0l, 0l, 0l, 0l, 0l, 0l, 0l, 0l, 
		0l, 0l, 0l, 0l, 0l, 0l, 0l, 0l, 
		0l, 0l, 0l, 0l, 0l, 0l, 0l, 0l, 
		589127539435831296l, 0l, 0l, 0l, 8594129448l, 287966489066078208l, 63897600l, 0l, 
		2373484594719785216l, 212149909852416l, -9223371899382267904l, 0l, 262144l, 0l, 0l, 0l, 
		0l, -4499205875826688l, 268435455l, 0l, -1l, 4503599627309055l, 3462142226429706238l, 257698089152l, 
		608l, 7l, 0l, 0l, 0l, 0l, 0l, 0l, 
		0l, 0l, 0l, 0l, 0l, 0l, 0l, 0l, 
		0l, 0l, 0l, 0l, 0l, 0l, 0l, 0l, 
		0l, 0l, 0l, 0l, 0l, 0l, 0l, 0l, 
		0l, 0l, 0l, 0l, 0l, 0l, 0l, 0l, 
		4391083966447l, -2l, -6575620097l, 8106479329266892799l, 4398046511072l, 0l, 0l, 0l, 
		567343704965120l, 0l, 34359738368l, 0l, 0l, 0l, 10469031936l, 2506768l, 
		0l, 0l, 0l, 0l, 0l, 0l, 0l, 0l, 
		0l, 0l, 0l, 0l, 0l, 0l, 0l, 0l, 
		0l, 0l, 0l, 0l, 0l, 0l, 0l, 0l, 
		0l, 0l, 0l, 0l, 0l, 0l, 0l, 0l, 
		0l, 0l, 0l, 0l, 0l, 0l, 0l, 0l, 
		0l, 0l, 0l, 0l, 0l, 0l, 0l, 0l, 
		0l, 0l, 0l, 0l, 0l, 0l, 0l, 0l, 
		0l, 0l, 0l, 0l, 0l, 0l, 0l, 0l, 
		0l, 0l, 0l, 0l, 0l, 0l, 0l, 0l, 
		0l, 0l, 0l, 0l, 0l, 0l, 0l, 0l, 
		0l, 0l, 0l, 0l, 0l, 0l, 0l, 0l, 
		0l, 0l, 0l, 0l, 0l, 0l, 0l, 0l, 
		0l, 0l, 0l, 0l, 0l, 0l, 0l, 0l, 
		-1200985880182161525l, 4614784734040292264l, -8346159706267518144l, -6274326567087083777l, 3843132844406990338l, -2857091161033809848l, -9214127441191982312l, 4975043047516783672l, 
		6052969164511162368l, -3981164340632825464l, 865838640637419809l, 587843721379217408l, -9223372028264576832l, 4322181463260932987l, 4102665139409662759l, -4654003939681592623l, 
		-5779970925193173553l, -6916255096043785201l, -4607676031203475194l, -4179058908334847352l, -3602804612330839711l, -8810225183321307222l, -8628822752135988620l, 4318951465173532422l, 
		6572717559398791002l, 4174275365377477961l, -6261481396691937195l, -5472885231251885097l, -3419405721147309374l, 6476304847164474970l, 7685956266821324703l, 6966115873905848880l, 
		-8478535815712943357l, 1747993776461213696l, 1189091073474478176l, -1859098137955662848l, 5623297225896494936l, 1785870027506054277l, 77804599717402748l, 2814925764786702348l, 
		9293154991876293l, 4611712545237118992l, 1152924806464406059l, 164759687120683042l, 1698682451677716628l, 2546785748291603350l, 5333615699259303390l, -8502777232079516608l, 
		1177130730154234874l, -8867582701241104831l, 4696132909688684544l, 574267482968582l, 41658296565760512l, 2606201534412423169l, -2055598013175784517l, -6989233459939176204l, 
		-66972678280280494l, -8790251955770110169l, -6797556863814389498l, 576783398870452242l, 6922141273974390988l, 4672925105921152l, 36028797589389316l, 6962226264409120800l, 
		4143980985948803438l, -4801963075702878156l, 4893197149484584145l, -4264903349422389760l, 1586013506395344159l, 1912682210313175041l, 3503911569688174519l, -1647635134447897992l, 
		-7484824374588676993l, -4662985261789665266l, 1807836026510783000l, 457673646540983392l, -9223362306537102525l, 45319138236847360l, 4647736256461031424l, -9214364562720682748l, 
		-2262966219467915968l, -3293821517344900213l, -5034433707051710959l, -1091291762064001036l, 2739469779034325894l, 919405639185332844l, 6168092749595006853l, -6821785705794641328l, 
		-6624737588016474073l, 504441092508485106l, 1558652360205926580l, 361876512805l, -3787307246837038591l, 41966488011313952l, 3603348860946815104l, 343386161496250490l, 
		5796873385962689613l, 4958957224874252298l, 4760376824691822740l, -3270455279526871040l, 2608355219606679297l, -3409885570589273267l, 137832219830979218l, -6909768513659895782l, 
		8326036417311072161l, 58559985004271487l, 11718337239744618l, 1595189100504427013l, -6768593505426773982l, 1405765513749987332l, 617601729058317269l, -6916367936784346110l, 
		6927245422658323456l, 1297599788849627280l, 28591605891089l, 0l, 5081186962480562176l, 1873502925397955272l, -9171576234297250082l, 2461371136760129574l, 
		2393038501361459424l, 7085577371095467719l, -356225298177879186l, 9073571477239436848l, 8804058572951672978l, 1265729513570889194l, -9140952800254340316l, 1912438106943002865l, 
		366104640721482784l, -4611606851285917672l, 3230915625027207784l, 148622600639776902l, 4632706554745356868l, 1518944820863707328l, 164381945013236496l, 211120191570437l, 
		153122421891792896l, -3359201535828389888l, 4290514274753988129l, 2486193498668139791l, 18999835930199552l, 2669581042075063328l, 155392885335819280l, 144186248312930312l, 
		-6060977583229501376l, -4168993196522327680l, 275194568440589331l, -226139874l, -1l, -1l, -1l, -1l, 
		-1l, -1l, -1l, -1l, -1l, -1l, -1l, -1l, 
		-1l, -1l, -1l, -1l, -1l, -1l, -1l, -1l, 
		-1l, -1l, -1l, -1l, -1l, -1l, -1l, -1l, 
		-1l, -1l, -1l, -1l, -1l, -1l, -1l, -1l, 
		-1l, -1l, -1l, -1l, -1l, -1l, -1l, -1l, 
		-1l, -1l, -1l, -1l, -1l, -1l, -1l, -1l, 
		-1l, -1l, -1l, -1l, -1l, -1l, -1l, -1l, 
		-1l, -1l, -1l, -1l, -1l, -1l, -1l, -1l, 
		-1l, -1l, -1l, -1l, -1l, -1l, -1l, -1l, 
		-1l, -1l, -1l, -1l, -1l, -1l, -1l, -1l, 
		-1l, -1l, -1l, -1l, -1l, -1l, -1l, -1l, 
		-1l, -1l, -1l, -1l, -1l, -1l, -1l, -1l, 
		-1l, -1l, -1l, -1l, -1l, -1l, -1l, -1l, 
		-1l, -1l, -1l, -1l, -1l, -1l, -1l, -1l, 
		-1l, -1l, -1l, -1l, -1l, -1l, -1l, -1l, 
		-1l, -1l, -1l, -1l, -1l, -1l, -1l, -1l, 
		-1l, -1l, -1l, -1l, -1l, -1l, -1l, -1l, 
		-1l, -1l, -1l, -1l, -1l, -1l, -1l, -1l, 
		-1l, -1l, -1l, -1l, -1l, -1l, -1l, -1l, 
		-1l, -1l, -1l, -1l, -1l, -1l, -1l, -1l, 
		-1l, -1l, -1l, 34359738367l, -4398046511104l, 7l, 34359738364l, -17179869184l, 
		-1734238320881303545l, -4608519595167129602l, 7570559769702825982l, 6485331509746262544l, 7675259664946166784l, -144115188075659248l, 274877906943l, 0l, 
		0l, 0l, 0l, 0l, 0l, 0l, 0l, 0l, 
		0l, 0l, 0l, 0l, 0l, 0l, 0l, 0l, 
		0l, 0l, 0l, 0l, 0l, 0l, 0l, 0l, 
		0l, 0l, 0l, 0l, 0l, 0l, 0l, 0l, 
		0l, 0l, 0l, 0l, 0l, 0l, 0l, 0l, 
		0l, 0l, 0l, 0l, 0l, 0l, 0l, 0l, 
		0l, 0l, 0l, 0l, 0l, 0l, 0l, 0l, 
		0l, 0l, 0l, 0l, 0l, 0l, 0l, 0l, 
		0l, 0l, 0l, 0l, 0l, 0l, 0l, 0l, 
		0l, 0l, 0l, 0l, 0l, 0l, 0l, 0l, 
		0l, 0l, 0l, 0l, 0l, 0l, 0l, 0l, 
		0l, 0l, 0l, 0l, 0l, 0l, 0l, 0l, 
		0l, 0l, 0l, 0l, 0l, 0l, 0l, 0l, 
		0l, 0l, 0l, 0l, 0l, 0l, 0l, 0l, 
		0l, 0l, 0l, 0l, 0l, 0l, 0l, 0l, 
		0l, 0l, 0l, 0l, 0l, 0l, 0l, 0l, 
		0l, 0l, 0l, 0l, 0l, 0l, 0l, 0l, 
		0l, 0l, 0l, 0l, 0l, 0l, 0l, 0l, 
		0l, 0l, 0l, 0l, 0l, 0l, 0l, 0l, 
		0l, 0l, 0l, 0l, 0l, 0l, 0l, 0l, 
		0l, 0l, 0l, 0l, 0l, 0l, 0l, 0l, 
		0l, 0l, 0l, 0l, 0l, 0l, 0l, 0l, 
		0l, 0l, 0l, 0l, 0l, 0l, 0l, 0l, 
		0l, 0l, 0l, 0l, 0l, 0l, 0l, 0l, 
		0l, 0l, 0l, 0l, 0l, 0l, 0l, 0l, 
		0l, 0l, 0l, 0l, 0l, 0l, 0l, 0l, 
		0l, 0l, 0l, 0l, 0l, 0l, 0l, 0l, 
		0l, 0l, 0l, 0l, 0l, 0l, 0l, 0l, 
		0l, 0l, 0l, 0l, 0l, 0l, 0l, 0l, 
		0l, 0l, 0l, 0l, 0l, 0l, 0l, 0l, 
		0l, 0l, 0l, 0l, 0l, 0l, 0l, 0l, 
		0l, 0l, 0l, 0l, 0l, 0l, 0l, 0l, 
		-1l, -1l, -1l, -1l, -1l, -1l, -1l, -1l, 
		4503599627370495l, 0l, 0l, 0l, 0l, 0l, 0l, 0l, 
		0l, 0l, 0l, 0l, -274877906944l, -1l, -1l, -1l, 
		-1l, -1l, -1l, -1l, -1l, -1l, -1l, -1l, 
		2097151l, 0l, 0l, 0l, 0l, 0l, 0l, 0l, 
		0l, 0l, 0l, 0l, 0l, 0l, 0l, 0l, 
		0l, 0l, 0l, 0l, 0l, 0l, 0l, 0l, 
		0l, 0l, 0l, 0l, 0l, 0l, 0l, 0l, 
		0l, 0l, 0l, 0l, 0l, 0l, 0l, 0l, 
		0l, 0l, 0l, 0l, 0l, 0l, 0l, 0l, 
		0l, 0l, 0l, 0l, 0l, 0l, 0l, 0l, 
		0l, 0l, 0l, 0l, 0l, 0l, 0l, 0l, 
		0l, 0l, 0l, 0l, 17592186044416l, 144115188075855872l, 2097152l, 563499709235200l, 
		0l, 0l, 0l, 0l, 0l, 0l, 0l, 0l, 
		0l, 0l, 0l, 0l, 0l, 0l, 0l, 0l, 
		0l, 0l, 0l, 0l, 0l, 0l, 0l, 0l, 
	};
	private static final long[] charset2312 = new long[]{


		0l, 0l, 0l, 0l, 0l, 0l, 0l, 0l, 
		0l, 0l, 0l, 0l, 0l, 0l, 0l, 0l, 
		0l, 0l, 0l, 0l, 0l, 0l, 0l, 0l, 
		0l, 0l, 0l, 0l, 0l, 0l, 0l, 0l, 
		0l, 0l, 0l, 0l, 0l, 0l, 0l, 0l, 
		0l, 0l, 0l, 0l, 0l, 0l, 0l, 0l, 
		0l, 0l, 0l, 0l, 0l, 0l, 0l, 0l, 
		0l, 0l, 0l, 0l, 0l, 0l, 0l, 0l, 
		0l, 0l, 0l, 0l, 0l, 0l, 0l, 0l, 
		0l, 0l, 0l, 0l, 0l, 0l, 0l, 0l, 
		0l, 0l, 0l, 0l, 0l, 0l, 0l, 0l, 
		0l, 0l, 0l, 0l, 0l, 0l, 0l, 0l, 
		0l, 0l, 0l, 0l, 0l, 0l, 0l, 0l, 
		0l, 0l, 0l, 0l, 0l, 0l, 0l, 0l, 
		0l, 0l, 0l, 0l, 0l, 0l, 0l, 0l, 
		0l, 0l, 0l, 0l, 0l, 0l, 0l, 0l, 
		580120202740498432l, 0l, 0l, 0l, 4194312l, 17587891077120l, 983040l, 0l, 
		2373484558210466048l, 211325275869440l, 137472507904l, 0l, 262144l, 0l, 0l, 0l, 
		0l, -4499205875826688l, 268435455l, 0l, -1l, 4095l, 3377712605429760l, 51392l, 
		96l, 5l, 0l, 0l, 0l, 0l, 0l, 0l, 
		0l, 0l, 0l, 0l, 0l, 0l, 0l, 0l, 
		0l, 0l, 0l, 0l, 0l, 0l, 0l, 0l, 
		0l, 0l, 0l, 0l, 0l, 0l, 0l, 0l, 
		0l, 0l, 0l, 0l, 0l, 0l, 0l, 0l, 
		16514863l, -2l, -8588886017l, 612489549322387455l, 4398046511072l, 0l, 0l, 0l, 
		4393751543808l, 0l, 0l, 0l, 0l, 0l, 0l, 0l, 
		0l, 0l, 0l, 0l, 0l, 0l, 0l, 0l, 
		0l, 0l, 0l, 0l, 0l, 0l, 0l, 0l, 
		0l, 0l, 0l, 0l, 0l, 0l, 0l, 0l, 
		0l, 0l, 0l, 0l, 0l, 0l, 0l, 0l, 
		0l, 0l, 0l, 0l, 0l, 0l, 0l, 0l, 
		0l, 0l, 0l, 0l, 0l, 0l, 0l, 0l, 
		0l, 0l, 0l, 0l, 0l, 0l, 0l, 0l, 
		0l, 0l, 0l, 0l, 0l, 0l, 0l, 0l, 
		0l, 0l, 0l, 0l, 0l, 0l, 0l, 0l, 
		0l, 0l, 0l, 0l, 0l, 0l, 0l, 0l, 
		0l, 0l, 0l, 0l, 0l, 0l, 0l, 0l, 
		0l, 0l, 0l, 0l, 0l, 0l, 0l, 0l, 
		0l, 0l, 0l, 0l, 0l, 0l, 0l, 0l, 
		-1200985880182161525l, 4614784734040292264l, -8346159706267518144l, -6274326567087083777l, 3843132844406990338l, -2857091161033809848l, -9214127441191982312l, 4975043047516783672l, 
		6052969164511162368l, -3981164340632825464l, 865838640637419809l, 587843721379217408l, -9223372028264576832l, 4322181463260932987l, 4102665139409662759l, -4654003939681592623l, 
		-5779970925193173553l, -6916255096043785201l, -4607676031203475194l, -4179058908334847352l, -3602804612330839711l, -8810225183321307222l, -8628822752135988620l, 4318951465173532422l, 
		6572717559398791002l, 4174275365377477961l, -6261481396691937195l, -5472885231251885097l, -3419405721147309374l, 6476304847164474970l, 7685956266821324703l, 6966115873905848880l, 
		-8478535815712943357l, 1747993776461213696l, 1189091073474478176l, -1859098137955662848l, 5623297225896494936l, 1785870027506054277l, 77804599717402748l, 2814925764786702348l, 
		9293154991876293l, 4611712545237118992l, 1152924806464406059l, 164759687120683042l, 1698682451677716628l, 2546785748291603350l, 5333615699259303390l, -8502777232079516608l, 
		1177130730154234874l, -8867582701241104831l, 4696132909688684544l, 574267482968582l, 41658296565760512l, 2606201534412423169l, -2055598013175784517l, -6989233459939176204l, 
		-66972678280280494l, -8790251955770110169l, -6797556863814389498l, 576783398870452242l, 6922141273974390988l, 4672925105921152l, 36028797589389316l, 6962226264409120800l, 
		4143980985948803438l, -4801963075702878156l, 4893197149484584145l, -4264903349422389760l, 1586013506395344159l, 1912682210313175041l, 3503911569688174519l, -1647635134447897992l, 
		-7484824374588676993l, -4662985261789665266l, 1807836026510783000l, 457673646540983392l, -9223362306537102525l, 45319138236847360l, 4647736256461031424l, -9214364562720682748l, 
		-2262966219467915968l, -3293821517344900213l, -5034433707051710959l, -1091291762064001036l, 2739469779034325894l, 919405639185332844l, 6168092749595006853l, -6821785705794641328l, 
		-6624737588016474073l, 504441092508485106l, 1558652360205926580l, 361876512805l, -3787307246837038591l, 41966488011313952l, 3603348860946815104l, 343386161496250490l, 
		5796873385962689613l, 4958957224874252298l, 4760376824691822740l, -3270455279526871040l, 2608355219606679297l, -3409885570589273267l, 137832219830979218l, -6909768513659895782l, 
		8326036417311072161l, 58559985004271487l, 11718337239744618l, 1595189100504427013l, -6768593505426773982l, 1405765513749987332l, 617601729058317269l, -6916367936784346110l, 
		6927245422658323456l, 1297599788849627280l, 28591605891089l, 0l, 5081186962480562176l, 1873502925397955272l, -9171576234297250082l, 2461371136760129574l, 
		2393038501361459424l, 7085577371095467719l, -356225298177879186l, 9073571477239436848l, 8804058572951672978l, 1265729513570889194l, -9140952800254340316l, 1912438106943002865l, 
		366104640721482784l, -4611606851285917672l, 3230915625027207784l, 148622600639776902l, 4632706554745356868l, 1518944820863707328l, 164381945013236496l, 211120191570437l, 
		153122421891792896l, -3359201535828389888l, 4290514274753988129l, 2486193498668139791l, 18999835930199552l, 2669581042075063328l, 155392885335819280l, 144186248312930312l, 
		-6060977583229501376l, -4168993196522327680l, 275194568440589331l, 2134691943723393310l, -4354314370383592438l, 4611879536777568256l, 904601220986063504l, 1163975899457285l, 
		1187073864975353448l, 4666045877039661058l, 288234225784670347l, -9164613734692028416l, 5597898610492219408l, -9001564944338986719l, 8304593988608231496l, -7920972079838255172l, 
		-3370611763721464789l, 7566196943270981641l, -9217109149865063980l, 5987184000619767140l, 1576439388575902610l, -2161699860699217781l, -6329502901219200975l, -2213384337288585216l, 
		6886341280290714119l, 1189086641619554465l, 4764527663568810624l, 329907364439330338l, 6633802320910483490l, 396494501491245891l, 7928587693808714803l, 2954830677388175947l, 
		-5005750946017286067l, -8660140608448233408l, -9221065941374852773l, -6485007087322527744l, 6127812984148495704l, 5379057195920366240l, 77194264071708705l, 5801274458342297794l, 
		-9151309217984898944l, 4041980665565028355l, 8218581364180910592l, 648660190100469154l, 150104812028928l, 36099165763141632l, 70643622084608l, 0l, 
		576460752303423488l, 130l, -1733956227295084540l, -144132848985571329l, 396316766134795263l, 4762071749329354804l, -5546885997657041918l, 1732551476790711330l, 
		-6203136856285693829l, -9222802489746375604l, -822207958782305575l, 3846003380149317727l, 4703605191673374276l, -138658719784559296l, 866948736021071109l, 6347881433498915919l, 
		5475177643451428983l, -1865122462685951344l, 7177611299248336148l, 761821352494562706l, 1691868569919476734l, 4143593114375258825l, 4025953090355872352l, 2523992866532922531l, 
		3531387188937947226l, 390188132856889408l, -6407355623452681340l, -8070151011424328174l, 4575683620501065728l, 5626123003835189000l, 180642132984365232l, -8646909016537464318l, 
		1224981847428169760l, -143455462777167872l, 320766678372203527l, 4836692349085273809l, -3994057152750934131l, 8669781371264717696l, 2605535796241377580l, 4755876115162991681l, 
		1298162618500383752l, -2268306515422072783l, 1189557318216591670l, 5988381488930112102l, 22812813517718532l, -8646911006452219886l, 74l, 2401781485658102l, 
		4611686018427388033l, 144115188075856128l, 525824l, 0l, 274877907072l, 17867063951360l, -577041298737856512l, -4398046576769l, 
		72057592964185599l, 506668178057728706l, 17831460l, 0l, -4831838208l, 70132209582473215l, -3082150958473278414l, 3434167446246971480l, 
		2747994073436558880l, -8046329171245920361l, 289523403169300642l, 16384l, 0l, -4672924418048l, 7080515171902025726l, 2560700411358691766l, 
		6440394066660667007l, -6903911386992107370l, 5727404783320041741l, 6994276890123682994l, 144818928164536340l, -2019910344389558712l, 301991915426364064l, 268629632l, 
		0l, 4503599627370496l, 70368744194048l, 256l, 4611686018427387904l, 4398046511104l, 32768l, 4195328l, 
		4611686018427387904l, 8796093022208l, -21102624l, -576461027250045057l, -2308095363346595841l, -9200924411826276617l, 0l, 9223353345157103616l, 
		-5152606128035070081l, 68705829614861301l, 8235113943707789664l, 4812244640212513523l, 4829305759190279123l, 1177693670330859520l, 5814256160614432l, 29342391932551168l, 
		0l, -9007199254740992l, 1065115957247l, 1652609138688l, 70368744251392l, -5406571730612256768l, 1237017669107l, 0l, 
		0l, -1143492092887040l, 1568099019363687927l, 720760943965509671l, 1730648930813247752l, 1221566l, 0l, 0l, 
		0l, -8070450532247928832l, 4467408102030272998l, 21273115896l, -4398046511104l, 7l, 34359738364l, -17179869184l, 
		-1734238320881303545l, -4608519595167129602l, 7570559769702825982l, 6485331509746262544l, 7675259664946166784l, -144115188075659248l, 274877906943l, 0l, 
		0l, 0l, 0l, 0l, 0l, 0l, 0l, 0l, 
		0l, 0l, 0l, 0l, 0l, 0l, 0l, 0l, 
		0l, 0l, 0l, 0l, 0l, 0l, 0l, 0l, 
		0l, 0l, 0l, 0l, 0l, 0l, 0l, 0l, 
		0l, 0l, 0l, 0l, 0l, 0l, 0l, 0l, 
		0l, 0l, 0l, 0l, 0l, 0l, 0l, 0l, 
		0l, 0l, 0l, 0l, 0l, 0l, 0l, 0l, 
		0l, 0l, 0l, 0l, 0l, 0l, 0l, 0l, 
		0l, 0l, 0l, 0l, 0l, 0l, 0l, 0l, 
		0l, 0l, 0l, 0l, 0l, 0l, 0l, 0l, 
		0l, 0l, 0l, 0l, 0l, 0l, 0l, 0l, 
		0l, 0l, 0l, 0l, 0l, 0l, 0l, 0l, 
		0l, 0l, 0l, 0l, 0l, 0l, 0l, 0l, 
		0l, 0l, 0l, 0l, 0l, 0l, 0l, 0l, 
		0l, 0l, 0l, 0l, 0l, 0l, 0l, 0l, 
		0l, 0l, 0l, 0l, 0l, 0l, 0l, 0l, 
		0l, 0l, 0l, 0l, 0l, 0l, 0l, 0l, 
		0l, 0l, 0l, 0l, 0l, 0l, 0l, 0l, 
		0l, 0l, 0l, 0l, 0l, 0l, 0l, 0l, 
		0l, 0l, 0l, 0l, 0l, 0l, 0l, 0l, 
		0l, 0l, 0l, 0l, 0l, 0l, 0l, 0l, 
		0l, 0l, 0l, 0l, 0l, 0l, 0l, 0l, 
		0l, 0l, 0l, 0l, 0l, 0l, 0l, 0l, 
		0l, 0l, 0l, 0l, 0l, 0l, 0l, 0l, 
		0l, 0l, 0l, 0l, 0l, 0l, 0l, 0l, 
		0l, 0l, 0l, 0l, 0l, 0l, 0l, 0l, 
		0l, 0l, 0l, 0l, 0l, 0l, 0l, 0l, 
		0l, 0l, 0l, 0l, 0l, 0l, 0l, 0l, 
		0l, 0l, 0l, 0l, 0l, 0l, 0l, 0l, 
		0l, 0l, 0l, 0l, 0l, 0l, 0l, 0l, 
		0l, 0l, 0l, 0l, 0l, 0l, 0l, 0l, 
		0l, 0l, 0l, 0l, 0l, 0l, 0l, 0l, 
		0l, 0l, 0l, 0l, 0l, 0l, 0l, 0l, 
		0l, 0l, 0l, 0l, 0l, 0l, 0l, 0l, 
		0l, 0l, 0l, 0l, 0l, 0l, 0l, 0l, 
		0l, 0l, 0l, 0l, 0l, 0l, 0l, 0l, 
		0l, 0l, 0l, 0l, 0l, 0l, 0l, 0l, 
		0l, 0l, 0l, 0l, 0l, 0l, 0l, 0l, 
		0l, 0l, 0l, 0l, 0l, 0l, 0l, 0l, 
		0l, 0l, 0l, 0l, 0l, 0l, 0l, 0l, 
		0l, 0l, 0l, 0l, 0l, 0l, 0l, 0l, 
		0l, 0l, 0l, 0l, 0l, 0l, 0l, 0l, 
		0l, 0l, 0l, 0l, 0l, 0l, 0l, 0l, 
		0l, 0l, 0l, 0l, 0l, 0l, 0l, 0l, 
		0l, 0l, 0l, 0l, 17592186044416l, 144115188075855872l, 2097152l, 563499709235200l, 
		0l, 0l, 0l, 0l, 0l, 0l, 0l, 0l, 
		0l, 0l, 0l, 0l, 0l, 0l, 0l, 0l, 
		0l, 0l, 0l, 0l, 0l, 0l, 0l, 0l, 
	};
	// 为了提高准确率，去掉了一些GB2312字符


	public static boolean has(char ch){
		int idx = (int)ch;
		if( idx < 0 ) return false;
		if( idx >=65536 ) return false;
		int left = idx >> 6;
		int right = idx & 0x3F;
		long t = charset[left];
		return ((1l << right) & t ) != 0;
	}
	
	public static boolean has2312(char ch){
		int idx = (int)ch;
		if( idx < 0 ) return false;
		if( idx >=65536 ) return false;
		int left = idx >> 6;
		int right = idx & 0x3F;
		long t = charset2312[left];
		return ((1l << right) & t ) != 0;
	}
	
	

}
