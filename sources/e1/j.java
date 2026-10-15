package e1;

import D0.o;
import Q1.E;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.hardware.Sensor;
import android.hardware.SensorManager;
import android.os.Handler;
import android.view.WindowManager;
import java.util.ArrayList;
import java.util.HashSet;
import p1.C1915a;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* loaded from: classes.dex */
public final class j {

    /* renamed from: l, reason: collision with root package name */
    public static final HashSet f12722l = new HashSet();

    /* renamed from: a, reason: collision with root package name */
    public boolean f12723a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f12724b;
    public final q2.e c;
    public final Context d;

    /* renamed from: f, reason: collision with root package name */
    public SensorManager f12726f;

    /* renamed from: g, reason: collision with root package name */
    public final k f12727g;

    /* renamed from: h, reason: collision with root package name */
    public int f12728h;

    /* renamed from: e, reason: collision with root package name */
    public final ArrayList f12725e = new ArrayList();

    /* renamed from: i, reason: collision with root package name */
    public final int[][] f12729i = {new int[]{1, -1, 0, 1}, new int[]{-1, -1, 1, 0}, new int[]{-1, 1, 0, 1}, new int[]{1, 1, 1, 0}};

    /* renamed from: j, reason: collision with root package name */
    public final h f12730j = new h(this);

    /* renamed from: k, reason: collision with root package name */
    public final E f12731k = new E(5, this);

    /* JADX WARN: Type inference failed for: r0v6, types: [e1.k, java.lang.Object] */
    public j(Context context) {
        int i4 = 16;
        boolean z4 = false;
        this.c = new q2.e(i4, z4);
        this.d = context;
        Handler handler = new Handler();
        ?? obj = new Object();
        q2.e eVar = new q2.e(i4, z4);
        obj.d = eVar;
        obj.f12734e = new ArrayList();
        obj.f12735f = 1.0f;
        obj.f12738i = new o(25, obj);
        obj.f12732a = context;
        obj.f12736g = handler;
        eVar.f14710q = new float[1];
        this.f12727g = obj;
    }

    public static boolean a(int i4) {
        return f12722l.contains(Integer.valueOf(i4));
    }

    public final void b(Intent intent) {
        q2.e eVar = this.c;
        eVar.f14710q = new float[4];
        int intExtra = intent.getIntExtra("status", -1);
        int intExtra2 = intent.getIntExtra("plugged", -1);
        boolean z4 = intExtra2 == 1;
        boolean z5 = intExtra2 == 2;
        boolean z6 = intExtra2 == 4;
        boolean z7 = intExtra == 5;
        float[] fArr = (float[]) eVar.f14710q;
        fArr[0] = z7 ? 1.0f : 0.0f;
        fArr[1] = z5 ? 1.0f : 0.0f;
        fArr[2] = z4 ? 1.0f : 0.0f;
        fArr[3] = z6 ? 1.0f : 0.0f;
    }

    public final void c(Intent intent) {
        q2.e eVar = this.c;
        eVar.f14710q = new float[5];
        eVar.f14711r = new String[1];
        int intExtra = intent.getIntExtra("scale", 0);
        if (intExtra < 1) {
            intExtra = 1;
        }
        int intExtra2 = intent.getIntExtra("level", 0);
        float[] fArr = (float[]) eVar.f14710q;
        fArr[0] = intExtra2 / intExtra;
        fArr[1] = intent.getIntExtra("temperature", -1);
        ((float[]) eVar.f14710q)[2] = intent.getIntExtra("health", -1);
        ((float[]) eVar.f14710q)[3] = intent.getIntExtra("voltage", -1);
        ((float[]) eVar.f14710q)[4] = intent.getIntExtra("status", -1);
        ((String[]) eVar.f14711r)[0] = intent.getStringExtra("technology");
    }

    public final void d(C1915a c1915a) {
        if (c1915a.a() == -1004) {
            k kVar = this.f12727g;
            ArrayList arrayList = kVar.f12734e;
            arrayList.add(c1915a);
            if (arrayList.size() == 1 || !kVar.c) {
                kVar.a();
                return;
            }
            return;
        }
        this.f12725e.add(c1915a);
        SensorManager sensorManager = this.f12726f;
        if (sensorManager == null) {
            return;
        }
        Sensor defaultSensor = sensorManager.getDefaultSensor(c1915a.a());
        if (defaultSensor != null) {
            this.f12726f.registerListener(new i(this, c1915a), defaultSensor, 3);
            return;
        }
        int a4 = c1915a.a();
        Context context = this.d;
        q2.e eVar = this.c;
        if (a4 == -1000) {
            Intent registerReceiver = context.registerReceiver(null, new IntentFilter("android.intent.action.BATTERY_CHANGED"));
            if (registerReceiver != null) {
                b(registerReceiver);
                c1915a.b(eVar);
                return;
            }
            return;
        }
        if (c1915a.a() == -1001) {
            boolean z4 = context.getResources().getConfiguration().orientation == 1;
            float[] fArr = new float[1];
            eVar.f14710q = fArr;
            fArr[0] = z4 ? 1.0f : 0.0f;
            c1915a.b(eVar);
            return;
        }
        if (c1915a.a() != -1002) {
            if (c1915a.a() == -1003) {
                e();
                c1915a.b(eVar);
                return;
            }
            return;
        }
        Intent registerReceiver2 = context.registerReceiver(null, new IntentFilter("android.intent.action.BATTERY_CHANGED"));
        if (registerReceiver2 != null) {
            c(registerReceiver2);
            c1915a.b(eVar);
        }
    }

    public final void e() {
        float[] fArr = new float[2];
        this.c.f14710q = fArr;
        fArr[0] = this.f12723a ? 1.0f : 0.0f;
        fArr[1] = this.f12724b ? 1.0f : 0.0f;
    }

    public final void f() {
        WindowManager windowManager = (WindowManager) this.d.getSystemService("window");
        if (windowManager != null) {
            this.f12728h = windowManager.getDefaultDisplay().getRotation();
        }
    }
}
