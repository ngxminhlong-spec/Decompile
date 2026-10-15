package D0;

import android.database.Cursor;
import c0.C0223d;
import java.util.HashSet;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* loaded from: classes.dex */
public final class o implements Runnable {

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ int f612o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ Object f613p;

    public /* synthetic */ o(int i4, Object obj) {
        this.f612o = i4;
        this.f613p = obj;
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00bb A[ADDED_TO_REGION, ORIG_RETURN, RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void b() {
        /*
            r5 = this;
            java.lang.Object r0 = r5.f613p
            c0.d r0 = (c0.C0223d) r0
            androidx.work.impl.WorkDatabase_Impl r0 = r0.c
            java.util.concurrent.locks.ReentrantReadWriteLock r0 = r0.f3529h
            java.util.concurrent.locks.ReentrantReadWriteLock$ReadLock r0 = r0.readLock()
            r1 = 0
            r0.lock()     // Catch: java.lang.Throwable -> L68 android.database.sqlite.SQLiteException -> L6a java.lang.IllegalStateException -> L6c
            java.lang.Object r2 = r5.f613p     // Catch: java.lang.Throwable -> L68 android.database.sqlite.SQLiteException -> L6a java.lang.IllegalStateException -> L6c
            c0.d r2 = (c0.C0223d) r2     // Catch: java.lang.Throwable -> L68 android.database.sqlite.SQLiteException -> L6a java.lang.IllegalStateException -> L6c
            boolean r2 = r2.a()     // Catch: java.lang.Throwable -> L68 android.database.sqlite.SQLiteException -> L6a java.lang.IllegalStateException -> L6c
            if (r2 != 0) goto L1e
            r0.unlock()
            return
        L1e:
            java.lang.Object r2 = r5.f613p     // Catch: java.lang.Throwable -> L68 android.database.sqlite.SQLiteException -> L6a java.lang.IllegalStateException -> L6c
            c0.d r2 = (c0.C0223d) r2     // Catch: java.lang.Throwable -> L68 android.database.sqlite.SQLiteException -> L6a java.lang.IllegalStateException -> L6c
            java.util.concurrent.atomic.AtomicBoolean r2 = r2.d     // Catch: java.lang.Throwable -> L68 android.database.sqlite.SQLiteException -> L6a java.lang.IllegalStateException -> L6c
            r3 = 0
            r4 = 1
            boolean r2 = r2.compareAndSet(r4, r3)     // Catch: java.lang.Throwable -> L68 android.database.sqlite.SQLiteException -> L6a java.lang.IllegalStateException -> L6c
            if (r2 != 0) goto L30
            r0.unlock()
            return
        L30:
            java.lang.Object r2 = r5.f613p     // Catch: java.lang.Throwable -> L68 android.database.sqlite.SQLiteException -> L6a java.lang.IllegalStateException -> L6c
            c0.d r2 = (c0.C0223d) r2     // Catch: java.lang.Throwable -> L68 android.database.sqlite.SQLiteException -> L6a java.lang.IllegalStateException -> L6c
            androidx.work.impl.WorkDatabase_Impl r2 = r2.c     // Catch: java.lang.Throwable -> L68 android.database.sqlite.SQLiteException -> L6a java.lang.IllegalStateException -> L6c
            g0.b r2 = r2.c     // Catch: java.lang.Throwable -> L68 android.database.sqlite.SQLiteException -> L6a java.lang.IllegalStateException -> L6c
            h0.b r2 = r2.c()     // Catch: java.lang.Throwable -> L68 android.database.sqlite.SQLiteException -> L6a java.lang.IllegalStateException -> L6c
            android.database.sqlite.SQLiteClosable r2 = r2.f13103p     // Catch: java.lang.Throwable -> L68 android.database.sqlite.SQLiteException -> L6a java.lang.IllegalStateException -> L6c
            android.database.sqlite.SQLiteDatabase r2 = (android.database.sqlite.SQLiteDatabase) r2     // Catch: java.lang.Throwable -> L68 android.database.sqlite.SQLiteException -> L6a java.lang.IllegalStateException -> L6c
            boolean r2 = r2.inTransaction()     // Catch: java.lang.Throwable -> L68 android.database.sqlite.SQLiteException -> L6a java.lang.IllegalStateException -> L6c
            if (r2 == 0) goto L4a
            r0.unlock()
            return
        L4a:
            java.lang.Object r2 = r5.f613p     // Catch: java.lang.Throwable -> L68 android.database.sqlite.SQLiteException -> L6a java.lang.IllegalStateException -> L6c
            c0.d r2 = (c0.C0223d) r2     // Catch: java.lang.Throwable -> L68 android.database.sqlite.SQLiteException -> L6a java.lang.IllegalStateException -> L6c
            androidx.work.impl.WorkDatabase_Impl r2 = r2.c     // Catch: java.lang.Throwable -> L68 android.database.sqlite.SQLiteException -> L6a java.lang.IllegalStateException -> L6c
            boolean r3 = r2.f3527f     // Catch: java.lang.Throwable -> L68 android.database.sqlite.SQLiteException -> L6a java.lang.IllegalStateException -> L6c
            if (r3 == 0) goto L73
            g0.b r2 = r2.c     // Catch: java.lang.Throwable -> L68 android.database.sqlite.SQLiteException -> L6a java.lang.IllegalStateException -> L6c
            h0.b r2 = r2.c()     // Catch: java.lang.Throwable -> L68 android.database.sqlite.SQLiteException -> L6a java.lang.IllegalStateException -> L6c
            r2.a()     // Catch: java.lang.Throwable -> L68 android.database.sqlite.SQLiteException -> L6a java.lang.IllegalStateException -> L6c
            java.util.HashSet r1 = r5.a()     // Catch: java.lang.Throwable -> L6e
            r2.k()     // Catch: java.lang.Throwable -> L6e
            r2.g()     // Catch: java.lang.Throwable -> L68 android.database.sqlite.SQLiteException -> L6a java.lang.IllegalStateException -> L6c
            goto L77
        L68:
            r1 = move-exception
            goto Lbc
        L6a:
            r2 = move-exception
            goto L7b
        L6c:
            r2 = move-exception
            goto L7b
        L6e:
            r3 = move-exception
            r2.g()     // Catch: java.lang.Throwable -> L68 android.database.sqlite.SQLiteException -> L6a java.lang.IllegalStateException -> L6c
            throw r3     // Catch: java.lang.Throwable -> L68 android.database.sqlite.SQLiteException -> L6a java.lang.IllegalStateException -> L6c
        L73:
            java.util.HashSet r1 = r5.a()     // Catch: java.lang.Throwable -> L68 android.database.sqlite.SQLiteException -> L6a java.lang.IllegalStateException -> L6c
        L77:
            r0.unlock()
            goto L83
        L7b:
            java.lang.String r3 = "ROOM"
            java.lang.String r4 = "Cannot run invalidation tracker. Is the db closed?"
            android.util.Log.e(r3, r4, r2)     // Catch: java.lang.Throwable -> L68
            goto L77
        L83:
            if (r1 == 0) goto Lbb
            boolean r0 = r1.isEmpty()
            if (r0 != 0) goto Lbb
            java.lang.Object r0 = r5.f613p
            c0.d r0 = (c0.C0223d) r0
            n.f r0 = r0.f3510h
            monitor-enter(r0)
            java.lang.Object r1 = r5.f613p     // Catch: java.lang.Throwable -> La6
            c0.d r1 = (c0.C0223d) r1     // Catch: java.lang.Throwable -> La6
            n.f r1 = r1.f3510h     // Catch: java.lang.Throwable -> La6
            java.util.Iterator r1 = r1.iterator()     // Catch: java.lang.Throwable -> La6
            n.b r1 = (n.b) r1     // Catch: java.lang.Throwable -> La6
            boolean r2 = r1.hasNext()     // Catch: java.lang.Throwable -> La6
            if (r2 != 0) goto La8
            monitor-exit(r0)     // Catch: java.lang.Throwable -> La6
            goto Lbb
        La6:
            r1 = move-exception
            goto Lb9
        La8:
            java.lang.Object r1 = r1.next()     // Catch: java.lang.Throwable -> La6
            java.util.Map$Entry r1 = (java.util.Map.Entry) r1     // Catch: java.lang.Throwable -> La6
            java.lang.Object r1 = r1.getValue()     // Catch: java.lang.Throwable -> La6
            c0.c r1 = (c0.AbstractC0222c) r1     // Catch: java.lang.Throwable -> La6
            r1.getClass()     // Catch: java.lang.Throwable -> La6
            r1 = 0
            throw r1     // Catch: java.lang.Throwable -> La6
        Lb9:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> La6
            throw r1
        Lbb:
            return
        Lbc:
            r0.unlock()
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: D0.o.b():void");
    }

    public HashSet a() {
        HashSet hashSet = new HashSet();
        Cursor g4 = ((C0223d) this.f613p).c.g(new B0.f("SELECT * FROM room_table_modification_log WHERE invalidated = 1;"));
        while (g4.moveToNext()) {
            try {
                hashSet.add(Integer.valueOf(g4.getInt(0)));
            } catch (Throwable th) {
                g4.close();
                throw th;
            }
        }
        g4.close();
        if (!hashSet.isEmpty()) {
            ((C0223d) this.f613p).f3508f.l();
        }
        return hashSet;
    }

    /* JADX WARN: Removed duplicated region for block: B:69:0x0191  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x01d3  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x01ec  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0214  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x021f  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0204  */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void run() {
        /*
            Method dump skipped, instructions count: 1222
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: D0.o.run():void");
    }
}
