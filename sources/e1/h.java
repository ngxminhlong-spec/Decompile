package e1;

import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import java.util.ArrayList;
import p1.C1915a;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* loaded from: classes.dex */
public final class h implements SensorEventListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ j f12719a;

    public h(j jVar) {
        this.f12719a = jVar;
    }

    @Override // android.hardware.SensorEventListener
    public final void onAccuracyChanged(Sensor sensor, int i4) {
        ArrayList arrayList = this.f12719a.f12725e;
        int size = arrayList.size();
        int i5 = 0;
        while (i5 < size) {
            Object obj = arrayList.get(i5);
            i5++;
            C1915a c1915a = (C1915a) obj;
            if (c1915a.a() == sensor.getType()) {
                c1915a.f14493a = i4;
            }
        }
    }

    @Override // android.hardware.SensorEventListener
    public final void onSensorChanged(SensorEvent sensorEvent) {
        j jVar = this.f12719a;
        ArrayList arrayList = jVar.f12725e;
        int size = arrayList.size();
        boolean z4 = true;
        int i4 = 0;
        while (i4 < size) {
            Object obj = arrayList.get(i4);
            i4++;
            C1915a c1915a = (C1915a) obj;
            if (c1915a.a() == sensorEvent.sensor.getType()) {
                if (z4 && c1915a.a() == 1) {
                    jVar.f();
                    float[] fArr = sensorEvent.values;
                    int[] iArr = jVar.f12729i[jVar.f12728h];
                    float f4 = iArr[0] * fArr[iArr[2]];
                    float f5 = iArr[1] * fArr[iArr[3]];
                    fArr[0] = f4;
                    fArr[1] = f5;
                    z4 = false;
                }
                q2.e eVar = jVar.c;
                eVar.f14709p = sensorEvent;
                c1915a.b(eVar);
            }
        }
    }
}
