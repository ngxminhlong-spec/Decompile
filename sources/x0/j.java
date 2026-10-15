package x0;

import com.google.android.gms.internal.ads.GB;
import com.google.android.gms.internal.measurement.A;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* loaded from: classes.dex */
public final class j implements Runnable {

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ int f15215o;

    /* renamed from: p, reason: collision with root package name */
    public final Object f15216p;

    /* renamed from: q, reason: collision with root package name */
    public final Object f15217q;

    public /* synthetic */ j(int i4, Object obj, Object obj2) {
        this.f15215o = i4;
        this.f15216p = obj;
        this.f15217q = obj2;
    }

    public j(GB gb, A a4, GB gb2) {
        this.f15215o = 2;
        this.f15217q = gb;
        this.f15216p = a4;
    }

    public /* synthetic */ j(Object obj, Object obj2, int i4, boolean z4) {
        this.f15215o = i4;
        this.f15217q = obj;
        this.f15216p = obj2;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(42:73|(1:75)(49:275|276|277|278|(1:280)(2:303|(43:305|282|283|(7:285|(1:287)(1:300)|288|289|290|291|292)(1:301)|293|77|(1:274)(1:81)|82|83|85|(1:87)|88|89|90|(1:92)|93|(6:95|(1:97)(1:106)|98|(3:102|103|101)|100|101)|(3:108|(1:110)(1:113)|111)|114|(1:116)(2:260|(23:262|(3:253|254|(21:256|(18:121|(1:123)(3:244|(3:247|(1:249)(1:250)|245)|251)|(1:125)(1:243)|126|(3:128|(1:130)(1:134)|(1:132)(1:133))|135|(1:137)|138|(1:242)(3:141|(2:231|(1:238))(1:151)|152)|(1:154)(1:230)|155|(1:157)|158|(1:162)|163|(2:165|(7:167|(1:169)|170|(1:172)|173|(4:177|(1:179)|180|(1:182))|183))(16:186|(2:188|(12:190|191|(1:193)|194|(3:196|197|198)|203|(2:205|(1:207))|208|(1:210)(1:218)|(1:214)|(1:216)|217))|219|(5:221|(1:223)(1:228)|224|(1:226)|227)|229|191|(0)|194|(0)|203|(0)|208|(0)(0)|(2:212|214)|(0)|217)|184|185)|252|(0)(0)|126|(0)|135|(0)|138|(0)|240|242|(0)(0)|155|(0)|158|(2:160|162)|163|(0)(0)|184|185))|119|(0)|252|(0)(0)|126|(0)|135|(0)|138|(0)|240|242|(0)(0)|155|(0)|158|(0)|163|(0)(0)|184|185))|117|(0)|119|(0)|252|(0)(0)|126|(0)|135|(0)|138|(0)|240|242|(0)(0)|155|(0)|158|(0)|163|(0)(0)|184|185))|281|282|283|(0)(0)|293|77|(1:79)|274|82|83|85|(0)|88|89|90|(0)|93|(0)|(0)|114|(0)(0)|117|(0)|119|(0)|252|(0)(0)|126|(0)|135|(0)|138|(0)|240|242|(0)(0)|155|(0)|158|(0)|163|(0)(0)|184|185)|76|77|(0)|274|82|83|85|(0)|88|89|90|(0)|93|(0)|(0)|114|(0)(0)|117|(0)|119|(0)|252|(0)(0)|126|(0)|135|(0)|138|(0)|240|242|(0)(0)|155|(0)|158|(0)|163|(0)(0)|184|185) */
    /* JADX WARN: Can't wrap try/catch for region: R(49:275|276|277|278|(1:280)(2:303|(43:305|282|283|(7:285|(1:287)(1:300)|288|289|290|291|292)(1:301)|293|77|(1:274)(1:81)|82|83|85|(1:87)|88|89|90|(1:92)|93|(6:95|(1:97)(1:106)|98|(3:102|103|101)|100|101)|(3:108|(1:110)(1:113)|111)|114|(1:116)(2:260|(23:262|(3:253|254|(21:256|(18:121|(1:123)(3:244|(3:247|(1:249)(1:250)|245)|251)|(1:125)(1:243)|126|(3:128|(1:130)(1:134)|(1:132)(1:133))|135|(1:137)|138|(1:242)(3:141|(2:231|(1:238))(1:151)|152)|(1:154)(1:230)|155|(1:157)|158|(1:162)|163|(2:165|(7:167|(1:169)|170|(1:172)|173|(4:177|(1:179)|180|(1:182))|183))(16:186|(2:188|(12:190|191|(1:193)|194|(3:196|197|198)|203|(2:205|(1:207))|208|(1:210)(1:218)|(1:214)|(1:216)|217))|219|(5:221|(1:223)(1:228)|224|(1:226)|227)|229|191|(0)|194|(0)|203|(0)|208|(0)(0)|(2:212|214)|(0)|217)|184|185)|252|(0)(0)|126|(0)|135|(0)|138|(0)|240|242|(0)(0)|155|(0)|158|(2:160|162)|163|(0)(0)|184|185))|119|(0)|252|(0)(0)|126|(0)|135|(0)|138|(0)|240|242|(0)(0)|155|(0)|158|(0)|163|(0)(0)|184|185))|117|(0)|119|(0)|252|(0)(0)|126|(0)|135|(0)|138|(0)|240|242|(0)(0)|155|(0)|158|(0)|163|(0)(0)|184|185))|281|282|283|(0)(0)|293|77|(1:79)|274|82|83|85|(0)|88|89|90|(0)|93|(0)|(0)|114|(0)(0)|117|(0)|119|(0)|252|(0)(0)|126|(0)|135|(0)|138|(0)|240|242|(0)(0)|155|(0)|158|(0)|163|(0)(0)|184|185) */
    /* JADX WARN: Code restructure failed: missing block: B:239:0x0590, code lost:
    
        if (r0.equals(x2.C2077i.f15674b) == false) goto L211;
     */
    /* JADX WARN: Code restructure failed: missing block: B:263:0x039e, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:265:0x03bc, code lost:
    
        x2.C2066c0.i(r15);
        r15.f15394f.c(x2.K.n(r10), r0, "Fetching Google App Id failed with exception. appId");
     */
    /* JADX WARN: Code restructure failed: missing block: B:302:0x02b3, code lost:
    
        r5 = "Unknown";
     */
    /* JADX WARN: Removed duplicated region for block: B:108:0x03a2 A[Catch: IllegalStateException -> 0x039e, TryCatch #2 {IllegalStateException -> 0x039e, blocks: (B:90:0x036a, B:93:0x0376, B:95:0x037e, B:98:0x038d, B:101:0x039b, B:103:0x0397, B:106:0x0389, B:108:0x03a2, B:110:0x03b3, B:111:0x03b8, B:113:0x03b6), top: B:89:0x036a }] */
    /* JADX WARN: Removed duplicated region for block: B:116:0x03dd  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x0424  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x0457  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x048f  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x04d0  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x0531 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:154:0x0594  */
    /* JADX WARN: Removed duplicated region for block: B:157:0x05ac  */
    /* JADX WARN: Removed duplicated region for block: B:160:0x05c8  */
    /* JADX WARN: Removed duplicated region for block: B:165:0x05e1  */
    /* JADX WARN: Removed duplicated region for block: B:186:0x064c  */
    /* JADX WARN: Removed duplicated region for block: B:193:0x0751  */
    /* JADX WARN: Removed duplicated region for block: B:196:0x0777  */
    /* JADX WARN: Removed duplicated region for block: B:205:0x07b2  */
    /* JADX WARN: Removed duplicated region for block: B:210:0x07cf  */
    /* JADX WARN: Removed duplicated region for block: B:216:0x07e6  */
    /* JADX WARN: Removed duplicated region for block: B:218:0x07d1  */
    /* JADX WARN: Removed duplicated region for block: B:230:0x059c  */
    /* JADX WARN: Removed duplicated region for block: B:243:0x045e  */
    /* JADX WARN: Removed duplicated region for block: B:253:0x03fc A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:260:0x03eb  */
    /* JADX WARN: Removed duplicated region for block: B:266:0x02fa  */
    /* JADX WARN: Removed duplicated region for block: B:267:0x0307  */
    /* JADX WARN: Removed duplicated region for block: B:268:0x0314  */
    /* JADX WARN: Removed duplicated region for block: B:269:0x0321  */
    /* JADX WARN: Removed duplicated region for block: B:270:0x032e  */
    /* JADX WARN: Removed duplicated region for block: B:271:0x033b  */
    /* JADX WARN: Removed duplicated region for block: B:272:0x0348  */
    /* JADX WARN: Removed duplicated region for block: B:273:0x0355  */
    /* JADX WARN: Removed duplicated region for block: B:285:0x028d A[Catch: NameNotFoundException -> 0x02b3, TryCatch #7 {NameNotFoundException -> 0x02b3, blocks: (B:283:0x0282, B:285:0x028d, B:287:0x0299), top: B:282:0x0282 }] */
    /* JADX WARN: Removed duplicated region for block: B:301:0x02aa  */
    /* JADX WARN: Removed duplicated region for block: B:310:0x082f  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x01c5  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x02d8  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x02ec  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0367  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0375  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x037e A[Catch: IllegalStateException -> 0x039e, TryCatch #2 {IllegalStateException -> 0x039e, blocks: (B:90:0x036a, B:93:0x0376, B:95:0x037e, B:98:0x038d, B:101:0x039b, B:103:0x0397, B:106:0x0389, B:108:0x03a2, B:110:0x03b3, B:111:0x03b8, B:113:0x03b6), top: B:89:0x036a }] */
    /* JADX WARN: Type inference failed for: r0v35, types: [x2.n, x2.h0] */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void run() {
        /*
            Method dump skipped, instructions count: 2338
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: x0.j.run():void");
    }
}
