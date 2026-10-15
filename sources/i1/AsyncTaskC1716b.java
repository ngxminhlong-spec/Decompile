package i1;

import C0.l0;
import android.os.AsyncTask;
import java.io.File;
import java.io.FileDescriptor;
import java.util.ArrayList;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* renamed from: i1.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class AsyncTaskC1716b extends AsyncTask {

    /* renamed from: a, reason: collision with root package name */
    public final InterfaceC1715a f13255a;

    /* renamed from: b, reason: collision with root package name */
    public final d f13256b;
    public final File c;
    public final FileDescriptor d;

    public AsyncTaskC1716b(InterfaceC1715a interfaceC1715a, d dVar, File file, FileDescriptor fileDescriptor) {
        this.f13255a = interfaceC1715a;
        this.f13256b = dVar;
        this.c = file;
        this.d = fileDescriptor;
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x0152 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Throwable a() {
        /*
            Method dump skipped, instructions count: 345
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: i1.AsyncTaskC1716b.a():java.lang.Throwable");
    }

    @Override // android.os.AsyncTask
    public final /* bridge */ /* synthetic */ Object doInBackground(Object[] objArr) {
        return a();
    }

    @Override // android.os.AsyncTask
    public final void onPostExecute(Object obj) {
        Throwable th = (Throwable) obj;
        AsyncTaskC1716b asyncTaskC1716b = c.f13258b;
        int i4 = 0;
        if (asyncTaskC1716b != null) {
            c.f13257a = asyncTaskC1716b;
            c.f13258b = null;
            c.f13257a.executeOnExecutor(AsyncTask.SERIAL_EXECUTOR, new Void[0]);
        } else {
            c.f13257a = null;
            InterfaceC1715a interfaceC1715a = this.f13255a;
            if (interfaceC1715a != null) {
                interfaceC1715a.k(th);
            }
        }
        ArrayList arrayList = c.c;
        int size = arrayList.size();
        while (i4 < size) {
            Object obj2 = arrayList.get(i4);
            i4++;
            ((l0) obj2).c(3, this.f13256b);
        }
    }
}
