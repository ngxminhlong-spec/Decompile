package com.google.android.gms.internal.ads;

import android.content.Context;
import android.media.MediaCodecInfo;
import android.media.MediaFormat;
import android.os.Bundle;
import android.os.Handler;
import android.os.SystemClock;
import android.os.Trace;
import android.view.Surface;
import b0.RunnableC0203p;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.regex.Pattern;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* loaded from: classes.dex */
public final class CF extends WD {

    /* renamed from: p1, reason: collision with root package name */
    public static final int[] f4413p1 = {1920, 1600, 1440, 1280, 960, 854, 640, 540, 480};

    /* renamed from: q1, reason: collision with root package name */
    public static boolean f4414q1;
    public static boolean r1;

    /* renamed from: M0, reason: collision with root package name */
    public final Context f4415M0;
    public final C0631g N0;

    /* renamed from: O0, reason: collision with root package name */
    public final C0882lv f4416O0;

    /* renamed from: P0, reason: collision with root package name */
    public final C0258Da f4417P0;

    /* renamed from: Q0, reason: collision with root package name */
    public final boolean f4418Q0;

    /* renamed from: R0, reason: collision with root package name */
    public C0887m f4419R0;

    /* renamed from: S0, reason: collision with root package name */
    public boolean f4420S0;

    /* renamed from: T0, reason: collision with root package name */
    public boolean f4421T0;

    /* renamed from: U0, reason: collision with root package name */
    public Surface f4422U0;

    /* renamed from: V0, reason: collision with root package name */
    public EF f4423V0;

    /* renamed from: W0, reason: collision with root package name */
    public boolean f4424W0;

    /* renamed from: X0, reason: collision with root package name */
    public int f4425X0;

    /* renamed from: Y0, reason: collision with root package name */
    public int f4426Y0;

    /* renamed from: Z0, reason: collision with root package name */
    public long f4427Z0;

    /* renamed from: a1, reason: collision with root package name */
    public long f4428a1;

    /* renamed from: b1, reason: collision with root package name */
    public long f4429b1;

    /* renamed from: c1, reason: collision with root package name */
    public int f4430c1;

    /* renamed from: d1, reason: collision with root package name */
    public int f4431d1;

    /* renamed from: e1, reason: collision with root package name */
    public int f4432e1;

    /* renamed from: f1, reason: collision with root package name */
    public long f4433f1;

    /* renamed from: g1, reason: collision with root package name */
    public long f4434g1;

    /* renamed from: h1, reason: collision with root package name */
    public long f4435h1;

    /* renamed from: i1, reason: collision with root package name */
    public int f4436i1;

    /* renamed from: j1, reason: collision with root package name */
    public long f4437j1;
    public C0914mk k1;

    /* renamed from: l1, reason: collision with root package name */
    public C0914mk f4438l1;

    /* renamed from: m1, reason: collision with root package name */
    public boolean f4439m1;

    /* renamed from: n1, reason: collision with root package name */
    public boolean f4440n1;

    /* renamed from: o1, reason: collision with root package name */
    public int f4441o1;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CF(Context context, Handler handler, SurfaceHolderCallbackC0730iC surfaceHolderCallbackC0730iC) {
        super(2, 30.0f);
        BF bf = new BF(0);
        Context applicationContext = context.getApplicationContext();
        this.f4415M0 = applicationContext;
        this.N0 = new C0631g(applicationContext);
        this.f4417P0 = new C0258Da(11, handler, surfaceHolderCallbackC0730iC);
        this.f4416O0 = new C0882lv(context, new C1332wF(bf), this);
        this.f4418Q0 = "NVIDIA".equals(AbstractC0751is.c);
        this.f4428a1 = -9223372036854775807L;
        this.f4425X0 = 1;
        this.k1 = C0914mk.f9648e;
        this.f4441o1 = 0;
        this.f4426Y0 = 0;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:100:0x01ac, code lost:
    
        if (r1.equals("itel_S41") != false) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:102:0x01b6, code lost:
    
        if (r1.equals("LS-5017") != false) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:104:0x01c0, code lost:
    
        if (r1.equals("panell_d") != false) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:106:0x01ca, code lost:
    
        if (r1.equals("j2xlteins") != false) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:108:0x01d4, code lost:
    
        if (r1.equals("A7000plus") != false) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:110:0x01de, code lost:
    
        if (r1.equals("manning") != false) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:112:0x01e8, code lost:
    
        if (r1.equals("GIONEE_WBL7519") != false) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:114:0x01f2, code lost:
    
        if (r1.equals("GIONEE_WBL7365") != false) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:116:0x01fc, code lost:
    
        if (r1.equals("GIONEE_WBL5708") != false) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:118:0x0206, code lost:
    
        if (r1.equals("QM16XE_U") != false) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:120:0x0210, code lost:
    
        if (r1.equals("Pixi5-10_4G") != false) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:122:0x021a, code lost:
    
        if (r1.equals("TB3-850M") != false) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:124:0x0224, code lost:
    
        if (r1.equals("TB3-850F") != false) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:126:0x022e, code lost:
    
        if (r1.equals("TB3-730X") != false) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:128:0x0238, code lost:
    
        if (r1.equals("TB3-730F") != false) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:130:0x0242, code lost:
    
        if (r1.equals("A7020a48") != false) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:132:0x024c, code lost:
    
        if (r1.equals("A7010a48") != false) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:134:0x0256, code lost:
    
        if (r1.equals("griffin") != false) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:136:0x0260, code lost:
    
        if (r1.equals("marino_f") != false) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:138:0x026a, code lost:
    
        if (r1.equals("CPY83_I00") != false) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:140:0x0274, code lost:
    
        if (r1.equals("A2016a40") != false) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:142:0x027e, code lost:
    
        if (r1.equals("le_x6") != false) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:144:0x0288, code lost:
    
        if (r1.equals("l5460") != false) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:146:0x0292, code lost:
    
        if (r1.equals("i9031") != false) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:148:0x029c, code lost:
    
        if (r1.equals("X3_HK") != false) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:150:0x02a6, code lost:
    
        if (r1.equals("V23GB") != false) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:152:0x02b0, code lost:
    
        if (r1.equals("Q4310") != false) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:154:0x02ba, code lost:
    
        if (r1.equals("Q4260") != false) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:156:0x02c4, code lost:
    
        if (r1.equals("PRO7S") != false) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:158:0x02ce, code lost:
    
        if (r1.equals("F3311") != false) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0028, code lost:
    
        if (r2.equals("machuca") != false) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:160:0x02d8, code lost:
    
        if (r1.equals("F3215") != false) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:162:0x02e2, code lost:
    
        if (r1.equals("F3213") != false) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:164:0x02ec, code lost:
    
        if (r1.equals("F3211") != false) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:166:0x02f6, code lost:
    
        if (r1.equals("F3116") != false) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:168:0x0300, code lost:
    
        if (r1.equals("F3113") != false) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:170:0x030a, code lost:
    
        if (r1.equals("F3111") != false) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:172:0x0314, code lost:
    
        if (r1.equals("E5643") != false) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:174:0x031e, code lost:
    
        if (r1.equals("A1601") != false) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:176:0x0328, code lost:
    
        if (r1.equals("Aura_Note_2") != false) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:178:0x0332, code lost:
    
        if (r1.equals("602LV") != false) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:180:0x033c, code lost:
    
        if (r1.equals("601LV") != false) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:182:0x0346, code lost:
    
        if (r1.equals("MEIZU_M5") != false) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:184:0x0350, code lost:
    
        if (r1.equals("p212") != false) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:186:0x035a, code lost:
    
        if (r1.equals("mido") != false) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:188:0x0364, code lost:
    
        if (r1.equals("kate") != false) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:190:0x036e, code lost:
    
        if (r1.equals("fugu") != false) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:192:0x0378, code lost:
    
        if (r1.equals("XE2X") != false) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:194:0x0382, code lost:
    
        if (r1.equals("Q427") != false) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:196:0x038c, code lost:
    
        if (r1.equals("Q350") != false) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:198:0x0396, code lost:
    
        if (r1.equals("P681") != false) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0031, code lost:
    
        if (r2.equals("once") != false) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:200:0x03a0, code lost:
    
        if (r1.equals("F04J") != false) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:202:0x03aa, code lost:
    
        if (r1.equals("F04H") != false) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:204:0x03b4, code lost:
    
        if (r1.equals("F03H") != false) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:206:0x03be, code lost:
    
        if (r1.equals("F02H") != false) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:208:0x03c8, code lost:
    
        if (r1.equals("F01J") != false) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:210:0x03d2, code lost:
    
        if (r1.equals("F01H") != false) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:212:0x03dc, code lost:
    
        if (r1.equals("1714") != false) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:214:0x03e6, code lost:
    
        if (r1.equals("1713") != false) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:216:0x03f0, code lost:
    
        if (r1.equals("1601") != false) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:218:0x03fa, code lost:
    
        if (r1.equals("flo") != false) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x003a, code lost:
    
        if (r2.equals("magnolia") != false) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:220:0x0404, code lost:
    
        if (r1.equals("deb") != false) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:222:0x040e, code lost:
    
        if (r1.equals("cv3") != false) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:224:0x0418, code lost:
    
        if (r1.equals("cv1") != false) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:226:0x0422, code lost:
    
        if (r1.equals("Z80") != false) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:228:0x042c, code lost:
    
        if (r1.equals("QX1") != false) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:230:0x0436, code lost:
    
        if (r1.equals("PLE") != false) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:232:0x0440, code lost:
    
        if (r1.equals("P85") != false) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:234:0x044a, code lost:
    
        if (r1.equals("MX6") != false) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:236:0x0454, code lost:
    
        if (r1.equals("M5c") != false) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:238:0x045e, code lost:
    
        if (r1.equals("M04") != false) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0043, code lost:
    
        if (r2.equals("aquaman") != false) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:240:0x0468, code lost:
    
        if (r1.equals("JGZ") != false) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:242:0x0472, code lost:
    
        if (r1.equals("mh") != false) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:244:0x047c, code lost:
    
        if (r1.equals("b5") != false) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:246:0x0486, code lost:
    
        if (r1.equals("V5") != false) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:248:0x0490, code lost:
    
        if (r1.equals("V1") != false) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:250:0x049a, code lost:
    
        if (r1.equals("Q5") != false) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:252:0x04a4, code lost:
    
        if (r1.equals("C1") != false) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:254:0x04ae, code lost:
    
        if (r1.equals("woods_fn") != false) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:256:0x04b8, code lost:
    
        if (r1.equals("ELUGA_A3_Pro") != false) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:258:0x04c2, code lost:
    
        if (r1.equals("Z12_PRO") != false) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x004c, code lost:
    
        if (r2.equals("oneday") != false) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:260:0x04cc, code lost:
    
        if (r1.equals("BLACK-1X") != false) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:262:0x04d6, code lost:
    
        if (r1.equals("taido_row") != false) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:264:0x04e0, code lost:
    
        if (r1.equals("Pixi4-7_3G") != false) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:266:0x04ea, code lost:
    
        if (r1.equals("GIONEE_GBL7360") != false) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:268:0x04f4, code lost:
    
        if (r1.equals("GiONEE_CBL7513") != false) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:270:0x04fe, code lost:
    
        if (r1.equals("OnePlus5T") != false) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:272:0x0508, code lost:
    
        if (r1.equals("whyred") != false) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:274:0x0512, code lost:
    
        if (r1.equals("watson") != false) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:276:0x051c, code lost:
    
        if (r1.equals("SVP-DTV15") != false) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:278:0x0526, code lost:
    
        if (r1.equals("A7000-a") != false) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0055, code lost:
    
        if (r2.equals("dangalUHD") != false) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:280:0x0530, code lost:
    
        if (r1.equals("nicklaus_f") != false) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:282:0x053a, code lost:
    
        if (r1.equals("tcl_eu") != false) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:284:0x0544, code lost:
    
        if (r1.equals("ELUGA_Ray_X") != false) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:286:0x054e, code lost:
    
        if (r1.equals("s905x018") != false) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:288:0x0558, code lost:
    
        if (r1.equals("A10-70L") != false) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:290:0x0562, code lost:
    
        if (r1.equals("A10-70F") != false) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:292:0x056c, code lost:
    
        if (r1.equals("namath") != false) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:294:0x0576, code lost:
    
        if (r1.equals("Slate_Pro") != false) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:296:0x0580, code lost:
    
        if (r1.equals("iris60") != false) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:298:0x058a, code lost:
    
        if (r1.equals("BRAVIA_ATV2") != false) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x005e, code lost:
    
        if (r2.equals("dangalFHD") != false) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:300:0x0594, code lost:
    
        if (r1.equals("GiONEE_GBL7319") != false) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:302:0x059e, code lost:
    
        if (r1.equals("panell_dt") != false) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:304:0x05a8, code lost:
    
        if (r1.equals("panell_ds") != false) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:306:0x05b2, code lost:
    
        if (r1.equals("panell_dl") != false) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:308:0x05bc, code lost:
    
        if (r1.equals("vernee_M5") != false) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:310:0x05c6, code lost:
    
        if (r1.equals("pacificrim") != false) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:312:0x05d0, code lost:
    
        if (r1.equals("Phantom6") != false) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:314:0x05da, code lost:
    
        if (r1.equals("ComioS1") != false) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:316:0x05e4, code lost:
    
        if (r1.equals("XT1663") != false) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:318:0x05ee, code lost:
    
        if (r1.equals("RAIJIN") != false) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0067, code lost:
    
        if (r2.equals("dangal") != false) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:320:0x05f8, code lost:
    
        if (r1.equals("AquaPowerM") != false) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:322:0x0601, code lost:
    
        if (r1.equals("PGN611") != false) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:324:0x060a, code lost:
    
        if (r1.equals("PGN610") != false) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:326:0x0613, code lost:
    
        if (r1.equals("PGN528") != false) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:328:0x061c, code lost:
    
        if (r1.equals("NX573J") != false) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:330:0x0625, code lost:
    
        if (r1.equals("NX541J") != false) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:332:0x062e, code lost:
    
        if (r1.equals("CP8676_I02") != false) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:334:0x0637, code lost:
    
        if (r1.equals("K50a40") != false) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:336:0x0640, code lost:
    
        if (r1.equals("GIONEE_SWW1631") != false) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:338:0x0649, code lost:
    
        if (r1.equals("GIONEE_SWW1627") != false) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:340:0x0652, code lost:
    
        if (r1.equals("GIONEE_SWW1609") != false) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:345:0x0666, code lost:
    
        if (r2.equals("JSN-L21") == false) goto L507;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x008e, code lost:
    
        if (r2.equals("AFTEUFF014") != false) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x0097, code lost:
    
        if (r2.equals("AFTSO001") != false) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x00a0, code lost:
    
        if (r2.equals("AFTEU014") != false) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x00a9, code lost:
    
        if (r2.equals("AFTEU011") != false) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x00b2, code lost:
    
        if (r2.equals("AFTR") != false) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x00bb, code lost:
    
        if (r2.equals("AFTN") != false) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x00c4, code lost:
    
        if (r2.equals("AFTA") != false) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x00cd, code lost:
    
        if (r2.equals("AFTKMST12") != false) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x00d6, code lost:
    
        if (r2.equals("AFTJMST12") != false) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x00ee, code lost:
    
        if (r1.equals("HWWAS-H") != false) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x00f8, code lost:
    
        if (r1.equals("HWVNS-H") != false) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x0102, code lost:
    
        if (r1.equals("ELUGA_Prim") != false) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x010c, code lost:
    
        if (r1.equals("ELUGA_Note") != false) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x0116, code lost:
    
        if (r1.equals("ASUS_X00AD_2") != false) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x0120, code lost:
    
        if (r1.equals("HWCAM-H") != false) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x012a, code lost:
    
        if (r1.equals("HWBLN-H") != false) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x0134, code lost:
    
        if (r1.equals("DM-01K") != false) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x013e, code lost:
    
        if (r1.equals("BRAVIA_ATV3_4K") != false) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x0148, code lost:
    
        if (r1.equals("Infinix-X572") != false) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:82:0x0152, code lost:
    
        if (r1.equals("PB2-670M") != false) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:84:0x015c, code lost:
    
        if (r1.equals("santoni") != false) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:86:0x0166, code lost:
    
        if (r1.equals("iball8735_9806") != false) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:88:0x0170, code lost:
    
        if (r1.equals("CPH1715") != false) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:90:0x017a, code lost:
    
        if (r1.equals("CPH1609") != false) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:92:0x0184, code lost:
    
        if (r1.equals("woods_f") != false) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:94:0x018e, code lost:
    
        if (r1.equals("htc_e56ml_dtul") != false) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:96:0x0198, code lost:
    
        if (r1.equals("EverStar_S") != false) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:98:0x01a2, code lost:
    
        if (r1.equals("hwALE-H") != false) goto L37;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final boolean r0(java.lang.String r5) {
        /*
            Method dump skipped, instructions count: 2286
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.CF.r0(java.lang.String):boolean");
    }

    /* JADX WARN: Type inference failed for: r5v1, types: [com.google.android.gms.internal.ads.lt, com.google.android.gms.internal.ads.ot] */
    public static List s0(Context context, C0976o2 c0976o2, boolean z4, boolean z5) {
        Iterable d;
        List d4;
        String str = c0976o2.f9813k;
        if (str == null) {
            C1052pt c1052pt = AbstractC1137rt.f10543p;
            return Gt.f5344s;
        }
        if (AbstractC0751is.f9071a >= 26 && "video/dolby-vision".equals(str) && !AF.a(context)) {
            String c = AbstractC0518dE.c(c0976o2);
            if (c == null) {
                C1052pt c1052pt2 = AbstractC1137rt.f10543p;
                d4 = Gt.f5344s;
            } else {
                d4 = AbstractC0518dE.d(c, z4, z5);
            }
            if (!d4.isEmpty()) {
                return d4;
            }
        }
        Pattern pattern = AbstractC0518dE.f8479a;
        List d5 = AbstractC0518dE.d(c0976o2.f9813k, z4, z5);
        String c2 = AbstractC0518dE.c(c0976o2);
        if (c2 == null) {
            C1052pt c1052pt3 = AbstractC1137rt.f10543p;
            d = Gt.f5344s;
        } else {
            d = AbstractC0518dE.d(c2, z4, z5);
        }
        ?? abstractC0880lt = new AbstractC0880lt(4);
        abstractC0880lt.c(d5);
        abstractC0880lt.c(d);
        return abstractC0880lt.f();
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0053, code lost:
    
        if (r3.equals("video/x-vnd.on2.vp8") != false) goto L53;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x0097, code lost:
    
        if (r3.equals("video/mp4v-es") != false) goto L53;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x00b1, code lost:
    
        if (r3.equals("video/av01") != false) goto L53;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x00ba, code lost:
    
        if (r3.equals("video/3gpp") != false) goto L53;
     */
    /* JADX WARN: Failed to find 'out' block for switch in B:17:0x003c. Please report as an issue. */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static int w0(com.google.android.gms.internal.ads.SD r7, com.google.android.gms.internal.ads.C0976o2 r8) {
        /*
            int r0 = r8.f9818p
            int r1 = r8.f9819q
            r2 = -1
            if (r0 == r2) goto Lc1
            if (r1 != r2) goto Lb
            goto Lc1
        Lb:
            java.lang.String r3 = r8.f9813k
            r3.getClass()
            java.lang.String r4 = "video/dolby-vision"
            boolean r4 = r4.equals(r3)
            java.lang.String r5 = "video/avc"
            java.lang.String r6 = "video/hevc"
            if (r4 == 0) goto L37
            android.util.Pair r8 = com.google.android.gms.internal.ads.AbstractC0518dE.b(r8)
            if (r8 == 0) goto L36
            java.lang.Object r8 = r8.first
            java.lang.Integer r8 = (java.lang.Integer) r8
            int r8 = r8.intValue()
            r3 = 512(0x200, float:7.17E-43)
            if (r8 == r3) goto L34
            r3 = 1
            if (r8 == r3) goto L34
            r3 = 2
            if (r8 != r3) goto L36
        L34:
            r3 = r5
            goto L37
        L36:
            r3 = r6
        L37:
            int r8 = r3.hashCode()
            r4 = 4
            switch(r8) {
                case -1664118616: goto Lb4;
                case -1662735862: goto Lab;
                case -1662541442: goto L9a;
                case 1187890754: goto L91;
                case 1331836730: goto L56;
                case 1599127256: goto L4d;
                case 1599127257: goto L41;
                default: goto L3f;
            }
        L3f:
            goto Lc1
        L41:
            java.lang.String r7 = "video/x-vnd.on2.vp9"
            boolean r7 = r3.equals(r7)
            if (r7 == 0) goto Lc1
            r4 = 8
            goto Lbc
        L4d:
            java.lang.String r7 = "video/x-vnd.on2.vp8"
            boolean r7 = r3.equals(r7)
            if (r7 == 0) goto Lc1
            goto Lbc
        L56:
            boolean r8 = r3.equals(r5)
            if (r8 == 0) goto Lc1
            java.lang.String r8 = com.google.android.gms.internal.ads.AbstractC0751is.d
            java.lang.String r3 = "BRAVIA 4K 2015"
            boolean r3 = r3.equals(r8)
            if (r3 != 0) goto Lc1
            java.lang.String r3 = "Amazon"
            java.lang.String r5 = com.google.android.gms.internal.ads.AbstractC0751is.c
            boolean r3 = r3.equals(r5)
            if (r3 == 0) goto L84
            java.lang.String r3 = "KFSOWI"
            boolean r3 = r3.equals(r8)
            if (r3 != 0) goto Lc1
            java.lang.String r3 = "AFTS"
            boolean r8 = r3.equals(r8)
            if (r8 == 0) goto L84
            boolean r7 = r7.f6960f
            if (r7 != 0) goto Lc1
        L84:
            int r0 = r0 + 15
            int r1 = r1 + 15
            int r0 = r0 / 16
            int r1 = r1 / 16
            int r1 = r1 * r0
            int r1 = r1 * 768
            int r1 = r1 / r4
            return r1
        L91:
            java.lang.String r7 = "video/mp4v-es"
            boolean r7 = r3.equals(r7)
            if (r7 == 0) goto Lc1
            goto Lbc
        L9a:
            boolean r7 = r3.equals(r6)
            if (r7 == 0) goto Lc1
            int r0 = r0 * r1
            int r0 = r0 * 3
            int r0 = r0 / r4
            r7 = 2097152(0x200000, float:2.938736E-39)
            int r7 = java.lang.Math.max(r7, r0)
            return r7
        Lab:
            java.lang.String r7 = "video/av01"
            boolean r7 = r3.equals(r7)
            if (r7 == 0) goto Lc1
            goto Lbc
        Lb4:
            java.lang.String r7 = "video/3gpp"
            boolean r7 = r3.equals(r7)
            if (r7 == 0) goto Lc1
        Lbc:
            int r0 = r0 * r1
            int r0 = r0 * 3
            int r0 = r0 / r4
            return r0
        Lc1:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.CF.w0(com.google.android.gms.internal.ads.SD, com.google.android.gms.internal.ads.o2):int");
    }

    public static int x0(SD sd, C0976o2 c0976o2) {
        int i4 = c0976o2.f9814l;
        List list = c0976o2.f9815m;
        if (i4 == -1) {
            return w0(sd, c0976o2);
        }
        int size = list.size();
        int i5 = 0;
        for (int i6 = 0; i6 < size; i6++) {
            i5 += ((byte[]) list.get(i6)).length;
        }
        return c0976o2.f9814l + i5;
    }

    @Override // com.google.android.gms.internal.ads.WD
    public final WB G(C0831kn c0831kn) {
        WB G3 = super.G(c0831kn);
        C0976o2 c0976o2 = (C0976o2) c0831kn.f9319p;
        c0976o2.getClass();
        C0258Da c0258Da = this.f4417P0;
        Handler handler = (Handler) c0258Da.f4618p;
        if (handler != null) {
            handler.post(new RunnableC0801k(c0258Da, c0976o2, G3, 0));
        }
        return G3;
    }

    /* JADX WARN: Code restructure failed: missing block: B:115:0x014f, code lost:
    
        if (true == r12) goto L80;
     */
    /* JADX WARN: Code restructure failed: missing block: B:116:0x0151, code lost:
    
        r8 = r9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:117:0x0154, code lost:
    
        if (true == r12) goto L83;
     */
    /* JADX WARN: Code restructure failed: missing block: B:118:0x0156, code lost:
    
        r9 = r10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:119:0x0157, code lost:
    
        r3 = new android.graphics.Point(r8, r9);
     */
    /* JADX WARN: Code restructure failed: missing block: B:121:0x0153, code lost:
    
        r8 = r10;
     */
    @Override // com.google.android.gms.internal.ads.WD
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.google.android.gms.internal.ads.OD J(com.google.android.gms.internal.ads.SD r25, com.google.android.gms.internal.ads.C0976o2 r26, float r27) {
        /*
            Method dump skipped, instructions count: 646
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.CF.J(com.google.android.gms.internal.ads.SD, com.google.android.gms.internal.ads.o2, float):com.google.android.gms.internal.ads.OD");
    }

    @Override // com.google.android.gms.internal.ads.WD
    public final ArrayList K(Yv yv, C0976o2 c0976o2) {
        List s02 = s0(this.f4415M0, c0976o2, false, false);
        Pattern pattern = AbstractC0518dE.f8479a;
        ArrayList arrayList = new ArrayList(s02);
        Collections.sort(arrayList, new XD(new TC(c0976o2)));
        return arrayList;
    }

    @Override // com.google.android.gms.internal.ads.WD
    public final void L(RB rb) {
        if (this.f4421T0) {
            ByteBuffer byteBuffer = rb.f6794h;
            byteBuffer.getClass();
            if (byteBuffer.remaining() >= 7) {
                byte b4 = byteBuffer.get();
                short s4 = byteBuffer.getShort();
                short s5 = byteBuffer.getShort();
                byte b5 = byteBuffer.get();
                byte b6 = byteBuffer.get();
                byteBuffer.position(0);
                if (b4 == -75 && s4 == 60 && s5 == 1 && b5 == 4) {
                    if (b6 == 0 || b6 == 1) {
                        byte[] bArr = new byte[byteBuffer.remaining()];
                        byteBuffer.get(bArr);
                        byteBuffer.position(0);
                        PD pd = this.f7386S;
                        pd.getClass();
                        Bundle bundle = new Bundle();
                        bundle.putByteArray("hdr10-plus-info", bArr);
                        pd.f(bundle);
                    }
                }
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.WD
    public final void M(Exception exc) {
        Wj.i("MediaCodecVideoRenderer", "Video codec error", exc);
        C0258Da c0258Da = this.f4417P0;
        Handler handler = (Handler) c0258Da.f4618p;
        if (handler != null) {
            handler.post(new RunnableC0674h(c0258Da, exc, 2));
        }
    }

    @Override // com.google.android.gms.internal.ads.WD
    public final void N(long j4, long j5, String str) {
        String str2;
        MediaCodecInfo.CodecProfileLevel[] codecProfileLevelArr;
        C0258Da c0258Da = this.f4417P0;
        Handler handler = (Handler) c0258Da.f4618p;
        if (handler != null) {
            str2 = str;
            handler.post(new RunnableC0674h(c0258Da, str2, j4, j5));
        } else {
            str2 = str;
        }
        this.f4420S0 = r0(str2);
        SD sd = this.f7393Z;
        sd.getClass();
        boolean z4 = false;
        if (AbstractC0751is.f9071a >= 29 && "video/x-vnd.on2.vp9".equals(sd.f6958b)) {
            MediaCodecInfo.CodecCapabilities codecCapabilities = sd.d;
            if (codecCapabilities == null || (codecProfileLevelArr = codecCapabilities.profileLevels) == null) {
                codecProfileLevelArr = new MediaCodecInfo.CodecProfileLevel[0];
            }
            int length = codecProfileLevelArr.length;
            int i4 = 0;
            while (true) {
                if (i4 >= length) {
                    break;
                }
                if (codecProfileLevelArr[i4].profile == 16384) {
                    z4 = true;
                    break;
                }
                i4++;
            }
        }
        this.f4421T0 = z4;
    }

    @Override // com.google.android.gms.internal.ads.WD
    public final void O(String str) {
        C0258Da c0258Da = this.f4417P0;
        Handler handler = (Handler) c0258Da.f4618p;
        if (handler != null) {
            handler.post(new RunnableC0674h(c0258Da, str, 4));
        }
    }

    @Override // com.google.android.gms.internal.ads.WD
    public final void P(C0976o2 c0976o2, MediaFormat mediaFormat) {
        PD pd = this.f7386S;
        if (pd != null) {
            pd.a(this.f4425X0);
        }
        mediaFormat.getClass();
        boolean z4 = mediaFormat.containsKey("crop-right") && mediaFormat.containsKey("crop-left") && mediaFormat.containsKey("crop-bottom") && mediaFormat.containsKey("crop-top");
        int integer = z4 ? (mediaFormat.getInteger("crop-right") - mediaFormat.getInteger("crop-left")) + 1 : mediaFormat.getInteger("width");
        int integer2 = z4 ? (mediaFormat.getInteger("crop-bottom") - mediaFormat.getInteger("crop-top")) + 1 : mediaFormat.getInteger("height");
        float f4 = c0976o2.f9822t;
        int i4 = c0976o2.f9821s;
        if (AbstractC0751is.f9071a >= 21) {
            if (i4 == 90 || i4 == 270) {
                f4 = 1.0f / f4;
                int i5 = integer2;
                integer2 = integer;
                integer = i5;
            }
            i4 = 0;
        }
        this.k1 = new C0914mk(integer, integer2, i4, f4);
        float f5 = c0976o2.f9820r;
        C0631g c0631g = this.N0;
        c0631g.f8769f = f5;
        C1418yF c1418yF = c0631g.f8766a;
        c1418yF.f11354a.b();
        c1418yF.f11355b.b();
        c1418yF.c = false;
        c1418yF.d = -9223372036854775807L;
        c1418yF.f11356e = 0;
        c0631g.c();
    }

    @Override // com.google.android.gms.internal.ads.WD
    public final void R() {
        this.f4426Y0 = Math.min(this.f4426Y0, 2);
        int i4 = AbstractC0751is.f9071a;
        this.f4416O0.getClass();
    }

    /* JADX WARN: Code restructure failed: missing block: B:152:0x0139, code lost:
    
        if (r22 > 100000) goto L85;
     */
    /* JADX WARN: Code restructure failed: missing block: B:157:0x014c, code lost:
    
        if (r27 >= r26.f7372G0.f7259b) goto L85;
     */
    /* JADX WARN: Code restructure failed: missing block: B:170:0x0075, code lost:
    
        if ((r12 == 0 ? false : r11.f11259g[(int) ((r12 - 1) % 15)]) != false) goto L22;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0159  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x016f  */
    /* JADX WARN: Type inference failed for: r8v10 */
    /* JADX WARN: Type inference failed for: r8v11, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r8v24 */
    /* JADX WARN: Type inference failed for: r8v25 */
    @Override // com.google.android.gms.internal.ads.WD
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean T(long r27, long r29, com.google.android.gms.internal.ads.PD r31, java.nio.ByteBuffer r32, int r33, int r34, int r35, long r36, boolean r38, boolean r39, com.google.android.gms.internal.ads.C0976o2 r40) {
        /*
            Method dump skipped, instructions count: 728
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.CF.T(long, long, com.google.android.gms.internal.ads.PD, java.nio.ByteBuffer, int, int, int, long, boolean, boolean, com.google.android.gms.internal.ads.o2):boolean");
    }

    @Override // com.google.android.gms.internal.ads.WD
    public final QD V(IllegalStateException illegalStateException, SD sd) {
        Surface surface = this.f4422U0;
        QD qd = new QD(illegalStateException, sd);
        System.identityHashCode(surface);
        if (surface != null) {
            surface.isValid();
        }
        return qd;
    }

    @Override // com.google.android.gms.internal.ads.WD
    public final void X(long j4) {
        super.X(j4);
        this.f4432e1--;
    }

    @Override // com.google.android.gms.internal.ads.WD
    public final void Y() {
        this.f4432e1++;
        int i4 = AbstractC0751is.f9071a;
    }

    @Override // com.google.android.gms.internal.ads.WD
    public final void Z(C0976o2 c0976o2) {
        int i4;
        boolean z4 = this.f4439m1;
        C0882lv c0882lv = this.f4416O0;
        if (!z4 || this.f4440n1) {
            c0882lv.getClass();
            this.f4440n1 = true;
            return;
        }
        c0882lv.getClass();
        try {
            Zf.X(!false);
            Zf.C((List) c0882lv.f9508r);
            try {
                Context context = (Context) c0882lv.f9507q;
                C1332wF c1332wF = (C1332wF) c0882lv.f9506p;
                int i5 = 16;
                if (Integer.bitCount(16) != 1) {
                    int highestOneBit = Integer.highestOneBit(15);
                    i5 = highestOneBit + highestOneBit;
                }
                long[] jArr = new long[i5];
                if (AbstractC0751is.f9071a >= 29) {
                    int i6 = context.getApplicationInfo().targetSdkVersion;
                }
                C0914mk c0914mk = C0914mk.f9648e;
                AbstractC0751is.y();
                ID id = c0976o2.f9825w;
                if (id == null || ((i4 = id.c) != 7 && i4 != 6)) {
                    id = ID.f5556h;
                }
                if (id.c == 7) {
                }
                C1052pt c1052pt = AbstractC1137rt.f10543p;
                Gt gt = Gt.f5344s;
                c1332wF.a();
                throw null;
            } catch (C0784jj e4) {
                throw new Exception(e4);
            }
        } catch (C0844l e5) {
            throw d0(e5, c0976o2, false, 7000);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r12v14, types: [android.view.Surface] */
    @Override // com.google.android.gms.internal.ads.GC
    public final void a(int i4, Object obj) {
        Handler handler;
        C0631g c0631g = this.N0;
        C0882lv c0882lv = this.f4416O0;
        if (i4 != 1) {
            if (i4 == 7) {
                obj.getClass();
                c0882lv.getClass();
                return;
            }
            if (i4 == 10) {
                obj.getClass();
                int intValue = ((Integer) obj).intValue();
                if (this.f4441o1 != intValue) {
                    this.f4441o1 = intValue;
                    return;
                }
                return;
            }
            if (i4 == 4) {
                obj.getClass();
                int intValue2 = ((Integer) obj).intValue();
                this.f4425X0 = intValue2;
                PD pd = this.f7386S;
                if (pd != null) {
                    pd.a(intValue2);
                    return;
                }
                return;
            }
            if (i4 == 5) {
                obj.getClass();
                int intValue3 = ((Integer) obj).intValue();
                if (c0631g.f8773j == intValue3) {
                    return;
                }
                c0631g.f8773j = intValue3;
                c0631g.d(true);
                return;
            }
            if (i4 == 13) {
                obj.getClass();
                c0882lv.f9508r = (List) obj;
                this.f4439m1 = true;
                return;
            } else {
                if (i4 != 14) {
                    return;
                }
                obj.getClass();
                c0882lv.getClass();
                return;
            }
        }
        EF ef = obj instanceof Surface ? (Surface) obj : null;
        if (ef == null) {
            EF ef2 = this.f4423V0;
            if (ef2 != null) {
                ef = ef2;
            } else {
                SD sd = this.f7393Z;
                if (sd != null && y0(sd)) {
                    ef = EF.a(this.f4415M0, sd.f6960f);
                    this.f4423V0 = ef;
                }
            }
        }
        Surface surface = this.f4422U0;
        C0258Da c0258Da = this.f4417P0;
        if (surface == ef) {
            if (ef == null || ef == this.f4423V0) {
                return;
            }
            C0914mk c0914mk = this.f4438l1;
            if (c0914mk != null) {
                c0258Da.u(c0914mk);
            }
            Surface surface2 = this.f4422U0;
            if (surface2 == null || !this.f4424W0 || (handler = (Handler) c0258Da.f4618p) == null) {
                return;
            }
            handler.post(new RunnableC0758j(c0258Da, surface2, SystemClock.elapsedRealtime(), 0));
            return;
        }
        this.f4422U0 = ef;
        c0631g.getClass();
        int i5 = AbstractC0751is.f9071a;
        boolean a4 = AbstractC0418b.a(ef);
        Surface surface3 = c0631g.f8768e;
        EF ef3 = true == a4 ? null : ef;
        if (surface3 != ef3) {
            c0631g.b();
            c0631g.f8768e = ef3;
            c0631g.d(true);
        }
        this.f4424W0 = false;
        int i6 = this.f7422v;
        PD pd2 = this.f7386S;
        EF ef4 = ef;
        if (pd2 != null) {
            c0882lv.getClass();
            EF ef5 = ef;
            if (AbstractC0751is.f9071a >= 23) {
                if (ef != null) {
                    ef5 = ef;
                    if (!this.f4420S0) {
                        pd2.j(ef);
                        ef4 = ef;
                    }
                } else {
                    ef5 = null;
                }
            }
            a0();
            W();
            ef4 = ef5;
        }
        if (ef4 == null || ef4 == this.f4423V0) {
            this.f4438l1 = null;
            this.f4426Y0 = Math.min(this.f4426Y0, 1);
            c0882lv.getClass();
            return;
        }
        C0914mk c0914mk2 = this.f4438l1;
        if (c0914mk2 != null) {
            c0258Da.u(c0914mk2);
        }
        this.f4426Y0 = Math.min(this.f4426Y0, 1);
        if (i6 == 2) {
            this.f4428a1 = -9223372036854775807L;
        }
        c0882lv.getClass();
    }

    @Override // com.google.android.gms.internal.ads.WD
    public final void d() {
        try {
            try {
                H();
                a0();
                this.f4440n1 = false;
                if (this.f4423V0 != null) {
                    v0();
                }
            } finally {
                this.f7379K0 = null;
            }
        } catch (Throwable th) {
            this.f4440n1 = false;
            if (this.f4423V0 != null) {
                v0();
            }
            throw th;
        }
    }

    @Override // com.google.android.gms.internal.ads.WD
    public final void f() {
        this.f4430c1 = 0;
        c0();
        long elapsedRealtime = SystemClock.elapsedRealtime();
        this.f4429b1 = elapsedRealtime;
        this.f4434g1 = AbstractC0751is.t(elapsedRealtime);
        this.f4435h1 = 0L;
        this.f4436i1 = 0;
        C0631g c0631g = this.N0;
        c0631g.d = true;
        c0631g.f8776m = 0L;
        c0631g.f8779p = -1L;
        c0631g.f8777n = -1L;
        InterfaceC0503d interfaceC0503d = c0631g.f8767b;
        if (interfaceC0503d != null) {
            ChoreographerFrameCallbackC0588f choreographerFrameCallbackC0588f = c0631g.c;
            choreographerFrameCallbackC0588f.getClass();
            choreographerFrameCallbackC0588f.f8664p.sendEmptyMessage(1);
            interfaceC0503d.a(new M3(1, c0631g));
        }
        c0631g.d(false);
    }

    @Override // com.google.android.gms.internal.ads.WD
    public final void g() {
        this.f4428a1 = -9223372036854775807L;
        int i4 = this.f4430c1;
        final C0258Da c0258Da = this.f4417P0;
        if (i4 > 0) {
            c0();
            long elapsedRealtime = SystemClock.elapsedRealtime();
            final long j4 = elapsedRealtime - this.f4429b1;
            final int i5 = this.f4430c1;
            Handler handler = (Handler) c0258Da.f4618p;
            if (handler != null) {
                handler.post(new Runnable() { // from class: com.google.android.gms.internal.ads.i
                    @Override // java.lang.Runnable
                    public final void run() {
                        C0258Da c0258Da2 = c0258Da;
                        c0258Da2.getClass();
                        int i6 = AbstractC0751is.f9071a;
                        VC vc = ((SurfaceHolderCallbackC0730iC) c0258Da2.f4619q).f9035o.f9386E;
                        OC f4 = vc.f((C1202tE) vc.f7251r.f8076o);
                        vc.e(f4, 1018, new n0.n(f4, i5, j4));
                    }
                });
            }
            this.f4430c1 = 0;
            this.f4429b1 = elapsedRealtime;
        }
        int i6 = this.f4436i1;
        if (i6 != 0) {
            long j5 = this.f4435h1;
            Handler handler2 = (Handler) c0258Da.f4618p;
            if (handler2 != null) {
                handler2.post(new RunnableC0674h(i6, j5, c0258Da));
            }
            this.f4435h1 = 0L;
            this.f4436i1 = 0;
        }
        C0631g c0631g = this.N0;
        c0631g.d = false;
        InterfaceC0503d interfaceC0503d = c0631g.f8767b;
        if (interfaceC0503d != null) {
            interfaceC0503d.b();
            ChoreographerFrameCallbackC0588f choreographerFrameCallbackC0588f = c0631g.c;
            choreographerFrameCallbackC0588f.getClass();
            choreographerFrameCallbackC0588f.f8664p.sendEmptyMessage(2);
        }
        c0631g.b();
    }

    @Override // com.google.android.gms.internal.ads.WD
    public final void h0() {
        if (this.f4426Y0 == 0) {
            this.f4426Y0 = 1;
        }
    }

    @Override // com.google.android.gms.internal.ads.WD
    public final void i0() {
        C0258Da c0258Da = this.f4417P0;
        this.f4438l1 = null;
        this.f4426Y0 = Math.min(this.f4426Y0, 0);
        int i4 = AbstractC0751is.f9071a;
        this.f4424W0 = false;
        try {
            super.i0();
            VB vb = this.f7370F0;
            c0258Da.getClass();
            synchronized (vb) {
            }
            Handler handler = (Handler) c0258Da.f4618p;
            if (handler != null) {
                handler.post(new RunnableC0203p(2, c0258Da, vb));
            }
            c0258Da.u(C0914mk.f9648e);
        } catch (Throwable th) {
            c0258Da.q(this.f7370F0);
            c0258Da.u(C0914mk.f9648e);
            throw th;
        }
    }

    /* JADX WARN: Type inference failed for: r5v1, types: [java.lang.Object, com.google.android.gms.internal.ads.VB] */
    @Override // com.google.android.gms.internal.ads.WD
    public final void j0(boolean z4, boolean z5) {
        this.f7370F0 = new Object();
        this.f7414r.getClass();
        VB vb = this.f7370F0;
        C0258Da c0258Da = this.f4417P0;
        Handler handler = (Handler) c0258Da.f4618p;
        if (handler != null) {
            handler.post(new RunnableC0674h(c0258Da, vb, 3));
        }
        this.f4426Y0 = z5 ? 1 : 0;
    }

    @Override // com.google.android.gms.internal.ads.WD
    public final void k(float f4, float f5) {
        super.k(f4, f5);
        C0631g c0631g = this.N0;
        c0631g.f8772i = f4;
        c0631g.f8776m = 0L;
        c0631g.f8779p = -1L;
        c0631g.f8777n = -1L;
        c0631g.d(false);
    }

    @Override // com.google.android.gms.internal.ads.WD
    public final void k0(boolean z4, long j4) {
        super.k0(z4, j4);
        this.f4416O0.getClass();
        this.f4426Y0 = Math.min(this.f4426Y0, 1);
        int i4 = AbstractC0751is.f9071a;
        C0631g c0631g = this.N0;
        c0631g.f8776m = 0L;
        c0631g.f8779p = -1L;
        c0631g.f8777n = -1L;
        this.f4433f1 = -9223372036854775807L;
        this.f4427Z0 = -9223372036854775807L;
        this.f4431d1 = 0;
        this.f4428a1 = -9223372036854775807L;
    }

    @Override // com.google.android.gms.internal.ads.WD
    public final void l0() {
        this.f4416O0.getClass();
    }

    @Override // com.google.android.gms.internal.ads.WD
    public final String m() {
        return "MediaCodecVideoRenderer";
    }

    public final void m0(PD pd, int i4) {
        int i5 = AbstractC0751is.f9071a;
        Trace.beginSection("releaseOutputBuffer");
        pd.c(i4, true);
        Trace.endSection();
        this.f7370F0.f7240e++;
        this.f4431d1 = 0;
        c0();
        this.f4434g1 = AbstractC0751is.t(SystemClock.elapsedRealtime());
        u0(this.k1);
        t0();
    }

    public final void n0(PD pd, int i4, long j4) {
        int i5 = AbstractC0751is.f9071a;
        Trace.beginSection("releaseOutputBuffer");
        pd.m(i4, j4);
        Trace.endSection();
        this.f7370F0.f7240e++;
        this.f4431d1 = 0;
        c0();
        this.f4434g1 = AbstractC0751is.t(SystemClock.elapsedRealtime());
        u0(this.k1);
        t0();
    }

    @Override // com.google.android.gms.internal.ads.WD
    public final boolean o() {
        return this.f7366D0;
    }

    public final void o0(PD pd, int i4) {
        int i5 = AbstractC0751is.f9071a;
        Trace.beginSection("skipVideoBuffer");
        pd.c(i4, false);
        Trace.endSection();
        this.f7370F0.f7241f++;
    }

    @Override // com.google.android.gms.internal.ads.WD
    public final boolean p() {
        EF ef;
        if (super.p() && (this.f4426Y0 == 3 || (((ef = this.f4423V0) != null && this.f4422U0 == ef) || this.f7386S == null))) {
            this.f4428a1 = -9223372036854775807L;
            return true;
        }
        if (this.f4428a1 == -9223372036854775807L) {
            return false;
        }
        c0();
        if (SystemClock.elapsedRealtime() < this.f4428a1) {
            return true;
        }
        this.f4428a1 = -9223372036854775807L;
        return false;
    }

    public final void p0(int i4, int i5) {
        VB vb = this.f7370F0;
        vb.f7243h += i4;
        int i6 = i4 + i5;
        vb.f7242g += i6;
        this.f4430c1 += i6;
        int i7 = this.f4431d1 + i6;
        this.f4431d1 = i7;
        vb.f7244i = Math.max(i7, vb.f7244i);
    }

    public final void q0(long j4) {
        VB vb = this.f7370F0;
        vb.f7246k += j4;
        vb.f7247l++;
        this.f4435h1 += j4;
        this.f4436i1++;
    }

    @Override // com.google.android.gms.internal.ads.WD
    public final float r(float f4, C0976o2[] c0976o2Arr) {
        float f5 = -1.0f;
        for (C0976o2 c0976o2 : c0976o2Arr) {
            float f6 = c0976o2.f9820r;
            if (f6 != -1.0f) {
                f5 = Math.max(f5, f6);
            }
        }
        if (f5 == -1.0f) {
            return -1.0f;
        }
        return f5 * f4;
    }

    @Override // com.google.android.gms.internal.ads.WD
    public final int s(Yv yv, C0976o2 c0976o2) {
        boolean z4;
        if (!"video".equals(AbstractC0438bd.f(c0976o2.f9813k))) {
            return 128;
        }
        int i4 = 1;
        int i5 = 0;
        boolean z5 = c0976o2.f9816n != null;
        Context context = this.f4415M0;
        List s02 = s0(context, c0976o2, z5, false);
        if (z5 && s02.isEmpty()) {
            s02 = s0(context, c0976o2, false, false);
        }
        if (!s02.isEmpty()) {
            if (c0976o2.f9803F == 0) {
                SD sd = (SD) s02.get(0);
                boolean c = sd.c(c0976o2);
                if (!c) {
                    for (int i6 = 1; i6 < s02.size(); i6++) {
                        SD sd2 = (SD) s02.get(i6);
                        if (sd2.c(c0976o2)) {
                            c = true;
                            z4 = false;
                            sd = sd2;
                            break;
                        }
                    }
                }
                z4 = true;
                int i7 = true != c ? 3 : 4;
                int i8 = true != sd.d(c0976o2) ? 8 : 16;
                int i9 = true != sd.f6961g ? 0 : 64;
                int i10 = true != z4 ? 0 : 128;
                if (AbstractC0751is.f9071a >= 26 && "video/dolby-vision".equals(c0976o2.f9813k) && !AF.a(context)) {
                    i10 = 256;
                }
                if (c) {
                    List s03 = s0(context, c0976o2, z5, true);
                    if (!s03.isEmpty()) {
                        Pattern pattern = AbstractC0518dE.f8479a;
                        ArrayList arrayList = new ArrayList(s03);
                        Collections.sort(arrayList, new XD(new TC(c0976o2)));
                        SD sd3 = (SD) arrayList.get(0);
                        if (sd3.c(c0976o2) && sd3.d(c0976o2)) {
                            i5 = 32;
                        }
                    }
                }
                return i7 | i8 | i5 | i9 | i10;
            }
            i4 = 2;
        }
        return i4 | 128;
    }

    @Override // com.google.android.gms.internal.ads.WD
    public final WB t(SD sd, C0976o2 c0976o2, C0976o2 c0976o22) {
        int i4;
        int i5;
        WB a4 = sd.a(c0976o2, c0976o22);
        int i6 = a4.f7352e;
        C0887m c0887m = this.f4419R0;
        c0887m.getClass();
        if (c0976o22.f9818p > c0887m.f9512a || c0976o22.f9819q > c0887m.f9513b) {
            i6 |= 256;
        }
        if (x0(sd, c0976o22) > c0887m.c) {
            i6 |= 64;
        }
        String str = sd.f6957a;
        if (i6 != 0) {
            i5 = 0;
            i4 = i6;
        } else {
            i4 = 0;
            i5 = a4.d;
        }
        return new WB(str, c0976o2, c0976o22, i5, i4);
    }

    public final void t0() {
        Surface surface = this.f4422U0;
        if (surface == null || this.f4426Y0 == 3) {
            return;
        }
        this.f4426Y0 = 3;
        C0258Da c0258Da = this.f4417P0;
        Handler handler = (Handler) c0258Da.f4618p;
        if (handler != null) {
            handler.post(new RunnableC0758j(c0258Da, surface, SystemClock.elapsedRealtime(), 0));
        }
        this.f4424W0 = true;
    }

    @Override // com.google.android.gms.internal.ads.WD
    public final void u() {
        super.u();
        this.f4432e1 = 0;
    }

    public final void u0(C0914mk c0914mk) {
        if (c0914mk.equals(C0914mk.f9648e) || c0914mk.equals(this.f4438l1)) {
            return;
        }
        this.f4438l1 = c0914mk;
        this.f4417P0.u(c0914mk);
    }

    public final void v0() {
        Surface surface = this.f4422U0;
        EF ef = this.f4423V0;
        if (surface == ef) {
            this.f4422U0 = null;
        }
        if (ef != null) {
            ef.release();
            this.f4423V0 = null;
        }
    }

    @Override // com.google.android.gms.internal.ads.WD
    public final boolean x(SD sd) {
        return this.f4422U0 != null || y0(sd);
    }

    public final boolean y0(SD sd) {
        if (AbstractC0751is.f9071a < 23 || r0(sd.f6957a)) {
            return false;
        }
        return !sd.f6960f || EF.b(this.f4415M0);
    }
}
